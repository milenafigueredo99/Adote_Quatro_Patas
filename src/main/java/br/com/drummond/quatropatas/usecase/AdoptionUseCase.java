package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.adapter.controller.exception.UnregisteredTutor;
import br.com.drummond.quatropatas.domain.Pet;
import br.com.drummond.quatropatas.usecase.port.AdoptionPort;
import br.com.drummond.quatropatas.usecase.port.TutorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdoptionUseCase {
    private final AdoptionPort adoptionPort;
    private final TutorPort tutorPort;

    public void adoptPet(String externalId, String cpf) {

        var tutor = tutorPort.findTutorByCpf(cpf);

        if (tutor.isEmpty()) {
            throw new UnregisteredTutor("Não existe tutor cadastrado com esse cpf");
        }
        adoptionPort.adoption(externalId, tutor.get());
    }

    public List<Pet> allAdoptedPetsByCpf(String cpf) {
        return adoptionPort.allAdoptedPetsByCpf(cpf);
    }
}
