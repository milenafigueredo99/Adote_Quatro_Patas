package br.com.drummond.quatropatas.usecase.port;

import br.com.drummond.quatropatas.domain.Pet;

import java.util.List;

public interface PetPort {

    void register(Pet pet);
    List<Pet> findAllPets();
    void deletePetByExternalId(String externalId);
    void updatePet(String externalId, Pet pet);
}