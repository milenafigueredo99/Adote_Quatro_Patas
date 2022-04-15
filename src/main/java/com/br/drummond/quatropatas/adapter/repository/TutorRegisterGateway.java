package com.br.drummond.quatropatas.adapter.repository;

import com.br.drummond.quatropatas.adapter.repository.jpa.TutorRepository;
import com.br.drummond.quatropatas.domain.Tutor;
import com.br.drummond.quatropatas.adapter.repository.jpa.mapper.TutorMapper;
import com.br.drummond.quatropatas.usecase.port.TutorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TutorRegisterGateway implements TutorPort {

    private final TutorRepository tutorRepository;
    private final TutorMapper tutorMapper;


    @Override
    public void register(Tutor tutor) {
        var tutorEntity = tutorMapper.toEntity(tutor);
        tutorRepository.save(tutorEntity);
    }
}
