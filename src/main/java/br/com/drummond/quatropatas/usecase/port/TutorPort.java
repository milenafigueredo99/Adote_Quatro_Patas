package br.com.drummond.quatropatas.usecase.port;

import br.com.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import br.com.drummond.quatropatas.domain.Tutor;

import java.util.List;
import java.util.Optional;

public interface TutorPort {

    void register(Tutor tutor);
    Optional<TutorEntity> findTutorByCpf(String cpf);
    List<Tutor> getAllTutors();

    void updateTutor(Tutor tutor,String cpf);

    void deleteByCpf(String cpf);
}
