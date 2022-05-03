package com.br.drummond.quatropatas.adapter.controller.mapper;

import com.br.drummond.quatropatas.adapter.controller.dto.PetInput;
import com.br.drummond.quatropatas.adapter.controller.dto.PetResponse;
import com.br.drummond.quatropatas.domain.Pet;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PetRegisterMapper {

    public Pet toDomain(PetInput input) {
        return Pet.builder()
                .name(input.getName())
                .age(input.getAge())
                .species(input.getSpecies())
                .gender(input.getGender())
                .size(input.getSize())
                .weight(input.getWeight())
                .address(input.getAddress())
                .deficiency(deficiencyInput(input.getDeficiency()))
                .build();
    }

    public PetResponse toResponse(Pet pet) {
        return PetResponse.builder()
                .name(pet.getName())
                .age(pet.getAge())
                .species(pet.getSpecies())
                .gender(pet.getGender())
                .size(pet.getSize())
                .weight(pet.getWeight())
                .address(pet.getAddress())
                .deficiency(deficiencyResponse(pet.isDeficiency()))
                .build();
    }

    public List<PetResponse> toResponse(List<Pet> pets) {
        return pets.stream().map(this::toResponse).collect(Collectors.toList());
    }

    public boolean deficiencyInput(String deficiency){
        if(deficiency.equalsIgnoreCase("nao")){
            return false;
        }
        return deficiency.equalsIgnoreCase("sim");
    }

    public String deficiencyResponse(boolean deficiency){
        if(!deficiency){
            return "não";
        }
        return "sim";
    }
}
