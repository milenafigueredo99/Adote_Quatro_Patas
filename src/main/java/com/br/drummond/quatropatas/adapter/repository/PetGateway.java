package com.br.drummond.quatropatas.adapter.repository;

import com.br.drummond.quatropatas.adapter.repository.jpa.PetRepository;
import com.br.drummond.quatropatas.adapter.repository.jpa.mapper.PetMapper;
import com.br.drummond.quatropatas.domain.Pet;
import com.br.drummond.quatropatas.usecase.port.PetPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
        return petRepository.findAll().stream().map(petMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deletePetByExternalId(String externalId) {
        petRepository.deleteByExternalId(externalId);
    }

    @Override
    public void updatePet(String externalId, Pet pet) {
        var petDb = petRepository.getPet(externalId).get();
        var updatedPet =  petMapper.teste(pet, petDb);
        petRepository.save(updatedPet);
    }

}
