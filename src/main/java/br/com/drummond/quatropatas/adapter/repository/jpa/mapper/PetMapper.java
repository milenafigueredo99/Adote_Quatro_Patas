package br.com.drummond.quatropatas.adapter.repository.jpa.mapper;

import br.com.drummond.quatropatas.adapter.repository.jpa.model.PetEntity;
import br.com.drummond.quatropatas.domain.Pet;
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

    public PetEntity toUpdate(Pet pet, PetEntity petEntity) {

        petEntity.setName(pet.getName());
        petEntity.setAge(pet.getAge());
        petEntity.setSpecies(pet.getSpecies());
        petEntity.setGender(pet.getGender());
        petEntity.setSize(pet.getSize());
        petEntity.setWeight(pet.getWeight());
        petEntity.setCity(pet.getCity());
        petEntity.setState(pet.getState());
        petEntity.setDeficiency(pet.getDeficiency());

        return petEntity;
    }

}
