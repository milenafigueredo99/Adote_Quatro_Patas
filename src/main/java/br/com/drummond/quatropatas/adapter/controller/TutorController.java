package br.com.drummond.quatropatas.adapter.controller;

import br.com.drummond.quatropatas.adapter.controller.dto.TutorInput;
import br.com.drummond.quatropatas.adapter.controller.dto.TutorResponse;
import br.com.drummond.quatropatas.adapter.controller.dto.TutorUpdateInput;
import br.com.drummond.quatropatas.adapter.controller.mapper.TutorRegisterMapper;
import br.com.drummond.quatropatas.usecase.TutorRegisterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/adote-quatropatas/tutor")
public class TutorController {

    private final TutorRegisterUseCase tutorRegisterUseCase;
    private final TutorRegisterMapper tutorRegisterMapper;

    @PostMapping
    private ResponseEntity<?> tutorRegistration(@Valid @RequestBody TutorInput tutorInput) {
        var tutor = tutorRegisterMapper.toDomain(tutorInput);
        tutorRegisterUseCase.registration(tutor);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    private ResponseEntity<List<TutorResponse>> findAllTutors(){
        var tutors = tutorRegisterUseCase.getAllTutors();
        return ResponseEntity.status(HttpStatus.OK).body(tutorRegisterMapper.toResponse(tutors));
    }

    @PutMapping
    private ResponseEntity<?> tutorUpdate(@Valid @RequestBody TutorUpdateInput tutorInput, @RequestParam String cpf){
        var tutor = tutorRegisterMapper.toDomain(tutorInput);
        tutorRegisterUseCase.updateRegister(cpf,tutor);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping
    private ResponseEntity<?> tutorDelete(@RequestParam String cpf) {
        tutorRegisterUseCase.deleteRegister(cpf);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
