package br.com.drummond.quatropatas.adapter.repository.jpa.mapper;

import br.com.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import br.com.drummond.quatropatas.domain.Tutor;
import org.springframework.stereotype.Component;

import java.util.List;
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

        tutorEntity.setName(tutor.getName());
        tutorEntity.setCity(tutor.getCity());
        tutorEntity.setState(tutor.getState());
        tutorEntity.setEmail(tutor.getEmail());
        tutorEntity.setTelephone(tutor.getTelephone());

        return tutorEntity;
    }
}
