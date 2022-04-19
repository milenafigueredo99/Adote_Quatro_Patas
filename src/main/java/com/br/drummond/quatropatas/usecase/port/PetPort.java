package com.br.drummond.quatropatas.usecase.port;

import com.br.drummond.quatropatas.domain.Pet;

import java.util.List;

public interface PetPort {

    void register(Pet pet);
    List<Pet> findAllPets();

}
