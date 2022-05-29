package br.com.drummond.quatropatas.adapter.repository;

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
        var petsDb = petRepository.findAll();

        return petMapper.toDomain(petsDb);
    }

    @Override
    @Transactional
    public void deletePetByExternalId(String externalId) {
        petRepository.deleteByExternalId(externalId);
    }

    @Override
    public void updatePet(String externalId, Pet pet) {
        var petDb = petRepository.getPet(externalId).get();
        var updatedPet = petMapper.toUpdate(pet, petDb);
        petRepository.save(updatedPet);
    }

}