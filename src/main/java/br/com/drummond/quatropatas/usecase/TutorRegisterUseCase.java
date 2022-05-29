package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.usecase.port.TutorPort;
import br.com.drummond.quatropatas.domain.Tutor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorRegisterUseCase {

    private final TutorPort tutorPort;

    public void registration(Tutor tutor){
        tutorPort.findTutorByCpf(tutor.getCpf());
        tutorPort.register(tutor);
    }

    public List<Tutor> getAllTutors() {
        return tutorPort.getAllTutors();
    }

    public void updateRegister(String cpf, Tutor tutor) {
        tutorPort.updateTutor(tutor,cpf);
    }

    public void deleteRegister(String cpf) {
        tutorPort.deleteByCpf(cpf);
    }
}
