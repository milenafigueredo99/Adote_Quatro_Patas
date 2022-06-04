package br.com.drummond.quatropatas.usecase.port;

import br.com.drummond.quatropatas.domain.Pet;

import java.util.List;

public interface PetPort {

    void register(Pet pet);
    List<Pet> findAllPets();
    void deletePetById(Long id);
    void updatePet(Long id, Pet pet);


    void existsById(Long id);
}
