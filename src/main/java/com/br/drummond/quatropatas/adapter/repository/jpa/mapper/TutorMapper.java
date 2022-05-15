package com.br.drummond.quatropatas.adapter.repository.jpa.mapper;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import com.br.drummond.quatropatas.domain.Tutor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class TutorMapper {
    public TutorEntity toEntity(Tutor tutor) {
        return TutorEntity.builder()
                .name(tutor.getName())
                .cpf(tutor.getCpf())
                .city(tutor.getCity())
                .state(tutor.getState())
                .email(tutor.getCity())
                .telephone(tutor.getTelephone())
                .build();
    }

    public Tutor toDomain(TutorEntity tutorEntity) {
        return Tutor.builder()
                .name(tutorEntity.getName())
                .cpf(tutorEntity.getCpf())
                .city(tutorEntity.getCity())
                .state(tutorEntity.getState())
                .email(tutorEntity.getEmail())
                .telephone(tutorEntity.getTelephone())
                .build();
    }

    public List<Tutor> toDomain(List<TutorEntity> tutors) {
        return tutors.stream().map(this::toDomain).collect(Collectors.toList());
    }

    public TutorEntity toUpdate(Tutor tutor, TutorEntity tutorEntity) {

        if (!Objects.equals(tutor.getName(), "") || !Objects.equals(tutor.getName(), " ")) {
            tutorEntity.setName(tutor.getName());
        }
        if (!Objects.equals(tutor.getCity(), "") || !Objects.equals(tutor.getCity(), " ")) {
            tutorEntity.setCity(tutor.getCity());
        }
        if (!Objects.equals(tutor.getState(), "") || !Objects.equals(tutor.getState(), " ")) {
            tutorEntity.setState(tutor.getState());
        }
        if (!Objects.equals(tutor.getEmail(), "") || !Objects.equals(tutor.getEmail(), " ")) {
            tutorEntity.setEmail(tutor.getEmail());
        }
        if (!Objects.equals(tutor.getTelephone(), "") || !Objects.equals(tutor.getTelephone(), " ")) {
            tutorEntity.setTelephone(tutor.getTelephone());
        }
        return tutorEntity;
    }
}
