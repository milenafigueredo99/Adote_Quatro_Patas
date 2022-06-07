package br.com.drummond.quatropatas.adapter.repository;

import br.com.drummond.quatropatas.adapter.controller.exception.UnregisteredTutor;
import br.com.drummond.quatropatas.adapter.repository.jpa.PetRepository;
import br.com.drummond.quatropatas.adapter.repository.jpa.TutorRepository;
import br.com.drummond.quatropatas.adapter.repository.jpa.mapper.TutorMapper;
import br.com.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import br.com.drummond.quatropatas.usecase.port.TutorPort;
import br.com.drummond.quatropatas.domain.Tutor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TutorRegisterGateway implements TutorPort {

    private final TutorRepository tutorRepository;
    private final PetRepository petRepository;
    private final TutorMapper tutorMapper;

    @Override
    public void register(Tutor tutor) {
        var tutorEntity = tutorMapper.toEntity(tutor);
        tutorRepository.save(tutorEntity);
    }

    @Override
    public Optional<TutorEntity> findTutorByCpf(String cpf) {
        return tutorRepository.exitsByCpf(cpf);
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
        var tutor = getTutor(cpf);
        petRepository.deletePets(tutor.getId());
        tutorRepository.deleteByCpf(cpf);
    }

    private TutorEntity getTutor(String cpf){
        var tutor = tutorRepository.exitsByCpf(cpf);
         if( tutorRepository.exitsByCpf(cpf).isEmpty()) {
             throw new UnregisteredTutor("Tutor não registrado");
         }
         return tutor.get();
    }
}
