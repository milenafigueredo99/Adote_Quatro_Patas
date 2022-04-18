package com.br.drummond.quatropatas.adapter.repository.jpa.mapper;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import com.br.drummond.quatropatas.domain.Tutor;
import org.springframework.stereotype.Component;

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
}
