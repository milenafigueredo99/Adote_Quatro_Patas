package br.com.drummond.quatropatas.adapter.repository;

import br.com.drummond.quatropatas.adapter.repository.jpa.PetRepository;
import br.com.drummond.quatropatas.adapter.repository.jpa.TutorRepository;
import br.com.drummond.quatropatas.adapter.repository.jpa.mapper.PetMapper;
import br.com.drummond.quatropatas.adapter.repository.jpa.model.PetEntity;
import br.com.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import br.com.drummond.quatropatas.domain.Pet;
import br.com.drummond.quatropatas.usecase.port.AdoptionPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AdoptionGateway implements AdoptionPort {

    private final PetRepository petRepository;
    private final TutorRepository tutorRepository;
    private final PetMapper petMapper;

    @Override
    public void adoption(Long id, TutorEntity tutorEntity) {
        var pet = savePet(id, tutorEntity);
        updateTutor(tutorEntity, pet);
    }

    @Override
    public List<Pet> allAdoptedPetsByCpf(String cpf) {
        var tutor =  tutorRepository.exitsByCpf(cpf);
        var petDB= tutor.get().getPets();

        return  petMapper.toDomain(petDB);

    }

    private PetEntity savePet(Long id, TutorEntity tutorEntity) {
        var pet = petRepository.findById(id).get();
        pet.setAdopted(true);
        pet.setTutor(tutorEntity);
        petRepository.save(pet);
        return pet;
    }

    private void updateTutor(TutorEntity tutorEntity, PetEntity pet) {
        var tutor = tutorEntity.toBuilder()
                .pets(List.of(pet))
                .build();
        tutorRepository.save(tutor);
    }
}
