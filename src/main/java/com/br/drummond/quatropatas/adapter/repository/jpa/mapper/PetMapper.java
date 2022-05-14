package com.br.drummond.quatropatas.adapter.repository.jpa.mapper;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.PetEntity;
import com.br.drummond.quatropatas.domain.Pet;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PetMapper {

    public PetEntity toEntity(Pet pet) {
        return PetEntity.builder()
                .externalId(pet.getExternalId())
                .name(pet.getName())
                .age(pet.getAge())
                .species(pet.getSpecies())
                .gender(pet.getGender())
                .size(pet.getSize())
                .weight(pet.getWeight())
                .city(pet.getCity())
                .state(pet.getState())
                .deficiency(pet.getDeficiency())
                .build();
    }

    public Pet toDomain(PetEntity pet) {
        return Pet.builder()
                .externalId(pet.getExternalId())
                .name(pet.getName())
                .age(pet.getAge())
                .species(pet.getSpecies())
                .gender(pet.getGender())
                .size(pet.getSize())
                .weight(pet.getWeight())
                .city(pet.getCity())
                .state(pet.getState())
                .deficiency(pet.getDeficiency())
                .build();
    }

    public List<Pet> toDomain(List<PetEntity> pets) {
        return pets.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public PetEntity teste(Pet pet, PetEntity petEntity) {
        return petEntity.toBuilder()
                .name(pet.getName())
                .age(pet.getAge())
                .species(pet.getSpecies())
                .gender(pet.getGender())
                .size(pet.getSize())
                .weight(pet.getWeight())
                .city(pet.getCity())
                .state(pet.getState())
                .deficiency(pet.getDeficiency())
                .build();
    }

}
