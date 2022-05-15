package com.br.drummond.quatropatas.adapter.repository.jpa.mapper;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.PetEntity;
import com.br.drummond.quatropatas.domain.Pet;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
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

    public PetEntity toUpdate(Pet pet, PetEntity petEntity) {

        if (!Objects.equals(pet.getName(), "") || !Objects.equals(pet.getName(), " ")) {
            petEntity.setName(pet.getName());
        }

//        if (pet.getAge() != "") {
//            petEntity.setAge(pet.getAge());
//        }

        if (!Objects.equals(pet.getSpecies(), "") || !Objects.equals(pet.getSpecies(), " ")) {
            petEntity.setSpecies(pet.getSpecies());
        }
        if (!Objects.equals(pet.getGender(), "") || !Objects.equals(pet.getGender(), " "))  {
            petEntity.setGender(pet.getGender());
        }
        if (!Objects.equals(pet.getSize(), "") || !Objects.equals(pet.getSize(), " ")) {
            petEntity.setSize(pet.getSize());
        }
//        if (pet.getWeight() != "") {
//            petEntity.setWeight(pet.getWeight());
//        }
        if (!Objects.equals(pet.getCity(), "") || !Objects.equals(pet.getCity(), " ") ) {
            petEntity.setCity(pet.getCity());
        }
        if (!Objects.equals(pet.getState(), "") || !Objects.equals(pet.getState(), " ")) {
            petEntity.setState(pet.getState());
        }
        if (!Objects.equals(pet.getDeficiency(), "") || !Objects.equals(pet.getDeficiency(), " ") ) {
            petEntity.setDeficiency(pet.getDeficiency());
        }
        return petEntity;
    }

}
