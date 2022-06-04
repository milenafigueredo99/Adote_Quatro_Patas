package br.com.drummond.quatropatas.adapter.controller;

import br.com.drummond.quatropatas.adapter.controller.dto.PetInput;
import br.com.drummond.quatropatas.usecase.PetUseCase;
import br.com.drummond.quatropatas.adapter.controller.mapper.PetRegisterMapper;
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
        return ResponseEntity.status(HttpStatus.OK).body(petRegisterMapper.toResponse(pets));
    }


    @PutMapping
    private ResponseEntity<?> updatePet(@Valid @RequestBody PetInput input, @RequestParam("id") Long id) {
        var pet = petRegisterMapper.toDomain(input);
        petUseCase.updateRegister(id, pet);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping
    private ResponseEntity<?> petRegister(@RequestParam(name = "id") Long id) {
        petUseCase.deleteRegister(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
