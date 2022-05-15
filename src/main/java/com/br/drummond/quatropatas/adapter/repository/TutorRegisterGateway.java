package com.br.drummond.quatropatas.adapter.repository;

import com.br.drummond.quatropatas.adapter.controller.exception.DuplicateRegistrationException;
import com.br.drummond.quatropatas.adapter.repository.jpa.TutorRepository;
import com.br.drummond.quatropatas.adapter.repository.jpa.mapper.TutorMapper;
import com.br.drummond.quatropatas.domain.Tutor;
import com.br.drummond.quatropatas.usecase.port.TutorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public void findTutorByCpf(String cpf) {

        if (tutorRepository.exitsByCpf(cpf).isPresent()) {
            throw new DuplicateRegistrationException("Já existe um cadastro com esse cpf");
        }

    }

    @Override
    public List<Tutor> getAllTutors() {
        var tutors = tutorRepository.findAll();
        return tutorMapper.toDomain(tutors);
    }

    @Override
    public void updateTutor(Tutor tutor, String cpf) {
        var tutorDb = tutorRepository.exitsByCpf(cpf).get();
        var updatedTutor = tutorMapper.toUpdate(tutor, tutorDb);
        tutorRepository.save(updatedTutor);
    }

    @Override
    @Transactional
    public void deleteByCpf(String cpf) {
        tutorRepository.deleteByCpf(cpf);
    }
}
