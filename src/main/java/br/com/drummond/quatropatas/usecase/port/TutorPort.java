package br.com.drummond.quatropatas.usecase.port;

import br.com.drummond.quatropatas.domain.Tutor;

import java.util.List;

public interface TutorPort {

    void register(Tutor tutor);
    void findTutorByCpf(String cpf);
    List<Tutor> getAllTutors();

    void updateTutor(Tutor tutor,String cpf);

    void deleteByCpf(String cpf);
}
