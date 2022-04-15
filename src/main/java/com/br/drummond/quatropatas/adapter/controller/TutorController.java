package com.br.drummond.quatropatas.adapter.controller;

import com.br.drummond.quatropatas.adapter.controller.dto.TutorInput;
import com.br.drummond.quatropatas.adapter.controller.mapper.TutorRegisterMapper;
import com.br.drummond.quatropatas.usecase.TutorRegister;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/adote-quatropatas/cliente")
public class TutorController {

    private final TutorRegister tutorRegister;
    private final TutorRegisterMapper tutorRegisterMapper;

    @PostMapping
    private ResponseEntity cadastro(@Valid @RequestBody TutorInput tutorInput) {
        var tutor = tutorRegisterMapper.toDomain(tutorInput);
        tutorRegister.registration(tutor);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }




}