package com.br.drummond.quatropatas.adapter.controller.mapper;

import com.br.drummond.quatropatas.adapter.controller.dto.TutorInput;
import com.br.drummond.quatropatas.domain.Tutor;
import org.springframework.stereotype.Component;

@Component
public class TutorRegisterMapper {

    public Tutor toDomain(TutorInput tutorInput) {
        return Tutor.builder()
                .name(tutorInput.getName())
                .cpf(tutorInput.getCpf())
                .address(tutorInput.getAddress())
                .email(tutorInput.getAddress())
                .telephone(tutorInput.getTelephone())
                .build();
    }
}
