package com.br.drummond.quatropatas.adapter.controller;

import com.br.drummond.quatropatas.adapter.controller.dto.PetInput;
import com.br.drummond.quatropatas.adapter.controller.mapper.PetRegisterMapper;
import com.br.drummond.quatropatas.usecase.PetUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/adote-quatropatas/pet")
public class PetController {

    private final PetUseCase petUseCase;
    private final PetRegisterMapper petRegisterMapper;

    @PostMapping
    private ResponseEntity<?> petRegister(@Valid @RequestBody PetInput input) {
        var pet = petRegisterMapper.toDomain(input);
        petUseCase.registration(pet);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    private ResponseEntity<?> findAllPets() {
        var pets = petUseCase.getAllPets();
        var test = petRegisterMapper.toResponse(pets);
        return ResponseEntity.status(HttpStatus.OK).body(test);
    }


    @PutMapping
    private ResponseEntity<?> updatePet(@Valid @RequestBody PetInput input, @RequestParam("id_externo") String externalId) {
        var pet = petRegisterMapper.toDomain(input);
        petUseCase.updateRegister(externalId, pet);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping
    private ResponseEntity<?> petRegister(@RequestParam(name = "id_externo") String externalId) {
        petUseCase.deleteRegister(externalId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
