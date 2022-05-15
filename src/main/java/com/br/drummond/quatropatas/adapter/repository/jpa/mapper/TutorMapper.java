package com.br.drummond.quatropatas.adapter.repository.jpa.mapper;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import com.br.drummond.quatropatas.domain.Tutor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TutorMapper {
    public TutorEntity toEntity(Tutor tutor) {
        return TutorEntity.builder()
                .name(tutor.getName())
                .cpf(tutor.getCpf())
                .address(tutor.getAddress())
                .email(tutor.getAddress())
                .telephone(tutor.getTelephone())
                .build();
    }

    public Tutor toDomain(TutorEntity tutorEntity){
        return Tutor.builder()
                .name(tutorEntity.getName())
                .cpf(tutorEntity.getCpf())
                .address(tutorEntity.getAddress())
                .email(tutorEntity.getEmail())
                .telephone(tutorEntity.getTelephone())
                .build();
    }

    public List<Tutor> toDomain(List<TutorEntity> tutors) {
        return tutors.stream().map(this::toDomain).collect(Collectors.toList());
    }
}
