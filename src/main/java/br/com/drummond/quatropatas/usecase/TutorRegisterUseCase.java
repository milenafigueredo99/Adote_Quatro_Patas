package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.adapter.controller.exception.DuplicateRegistrationException;
import br.com.drummond.quatropatas.domain.Tutor;
import br.com.drummond.quatropatas.usecase.port.TutorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorRegisterUseCase {

    private final TutorPort tutorPort;

    public void registration(Tutor tutor) {
        if (tutorPort.findTutorByCpf(tutor.getCpf()).isPresent()) {
            throw new DuplicateRegistrationException("Já exite um cadastro com esse cpf");
        }
        tutorPort.register(tutor);
    }

    public List<Tutor> getAllTutors() {
        return tutorPort.getAllTutors();
    }

    public void updateRegister(String cpf, Tutor tutor) {
        tutorPort.updateTutor(tutor, cpf);
    }

    public void deleteRegister(String cpf) {
        tutorPort.deleteByCpf(cpf);
    }
}
