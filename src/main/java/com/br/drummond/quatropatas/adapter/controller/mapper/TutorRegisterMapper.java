package com.br.drummond.quatropatas.adapter.controller.mapper;

import com.br.drummond.quatropatas.adapter.controller.dto.TutorInput;
import com.br.drummond.quatropatas.adapter.controller.dto.TutorResponse;
import com.br.drummond.quatropatas.domain.Tutor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    public TutorResponse toResponse(Tutor tutor) {
        return TutorResponse.builder()
                .name(tutor.getName())
                .address(tutor.getAddress())
                .email(tutor.getAddress())
                .telephone(tutor.getTelephone())
                .build();
    }

    public List<TutorResponse> toResponse(List<Tutor> tutors) {
        return tutors.stream().map(this::toResponse).collect(Collectors.toList());
    }
}
