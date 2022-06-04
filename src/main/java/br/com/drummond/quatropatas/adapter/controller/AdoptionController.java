package br.com.drummond.quatropatas.adapter.controller;

import br.com.drummond.quatropatas.adapter.controller.dto.AdoptionInput;
import br.com.drummond.quatropatas.adapter.controller.mapper.PetRegisterMapper;
import br.com.drummond.quatropatas.usecase.AdoptionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/adote-quatropatas/adocao")
public class AdoptionController {

    private final AdoptionUseCase adoptionUseCase;
    private final PetRegisterMapper petRegisterMapper;

    @PostMapping
    public ResponseEntity<?> adoptionPet(@RequestBody AdoptionInput input) {
        adoptionUseCase.adoptPet(input.getId(), input.getCpf());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<?> petsAdoptedByCpf(@RequestParam String cpf) {
        var pets = adoptionUseCase.allAdoptedPetsByCpf(cpf);
        return ResponseEntity.status(HttpStatus.OK).body(petRegisterMapper.toResponse(pets));
    }

}
