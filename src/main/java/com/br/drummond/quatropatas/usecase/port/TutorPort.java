package com.br.drummond.quatropatas.usecase.port;

import com.br.drummond.quatropatas.domain.Tutor;

import java.util.List;

public interface TutorPort {

    void register(Tutor tutor);

    void findTutorByCpf(String cpf);

    List<Tutor> getAllTutors();
}
