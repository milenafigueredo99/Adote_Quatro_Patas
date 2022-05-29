package br.com.drummond.quatropatas.adapter.controller;

import br.com.drummond.quatropatas.usecase.AdoptionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/adote-quatropatas/adocao")
public class AdoptionController {

    private final AdoptionUseCase adoptionUseCase;

    @GetMapping
    public ResponseEntity adoptionPet(@RequestParam(name = "id_externo") String externalId) {
        adoptionUseCase.adoptPet(externalId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
