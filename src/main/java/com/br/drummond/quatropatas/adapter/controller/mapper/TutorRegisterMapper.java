package com.br.drummond.quatropatas.adapter.controller.mapper;

import com.br.drummond.quatropatas.adapter.controller.dto.TutorInput;
import com.br.drummond.quatropatas.adapter.controller.dto.TutorResponse;
import com.br.drummond.quatropatas.adapter.controller.dto.TutorUpdateInput;
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
                .city(tutorInput.getCity())
                .state(tutorInput.getState())
                .email(tutorInput.getEmail())
                .telephone(tutorInput.getTelephone())
                .build();
    }

    public Tutor toDomain(TutorUpdateInput tutorInput) {
        return Tutor.builder()
                .name(tutorInput.getName())
                .city(tutorInput.getCity())
                .state(tutorInput.getState())
                .email(tutorInput.getEmail())
                .telephone(tutorInput.getTelephone())
                .build();
    }

    public TutorResponse toResponse(Tutor tutor) {
        return TutorResponse.builder()
                .name(tutor.getName())
                .city(tutor.getCity())
                .state(tutor.getState())
                .email(tutor.getCity())
                .telephone(tutor.getTelephone())
                .build();
    }

    public List<TutorResponse> toResponse(List<Tutor> tutors) {
        return tutors.stream().map(this::toResponse).collect(Collectors.toList());
    }
}
