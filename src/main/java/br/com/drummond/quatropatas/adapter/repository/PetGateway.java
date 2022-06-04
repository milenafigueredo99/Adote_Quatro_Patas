package br.com.drummond.quatropatas.adapter.repository;

import br.com.drummond.quatropatas.adapter.controller.exception.UnregisteredPetException;
import br.com.drummond.quatropatas.adapter.repository.jpa.PetRepository;
import br.com.drummond.quatropatas.adapter.repository.jpa.mapper.PetMapper;
import br.com.drummond.quatropatas.usecase.port.PetPort;
import br.com.drummond.quatropatas.domain.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PetGateway implements PetPort {

    private final PetRepository petRepository;
    private final PetMapper petMapper;

    @Override
    public void register(Pet pet) {
        var petEntity = petMapper.toEntity(pet);
        petRepository.save(petEntity);
    }

    @Override
    public List<Pet> findAllPets() {
        var petsDb = petRepository.findPetNotAdopted();

        return petMapper.toDomain(petsDb);
    }

    @Override
    @Transactional
    public void deletePetById(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public void updatePet(Long externalId, Pet pet) {
        var petDb = petRepository.findById(externalId).get();
        var updatedPet = petMapper.toUpdate(pet, petDb);
        petRepository.save(updatedPet);
    }

    @Override
    public void existsById(Long id) {
        if (petRepository.findById(id).isEmpty()){
            throw new UnregisteredPetException("Não existe pet registrado com esse id");
        }
    }

}
