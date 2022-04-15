package com.br.drummond.quatropatas.usecase;

import com.br.drummond.quatropatas.domain.Tutor;
import com.br.drummond.quatropatas.usecase.port.TutorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TutorRegister {

    private final TutorPort tutorPort;

    public void registration(Tutor tutor){
        tutorPort.register(tutor);
    }
}
