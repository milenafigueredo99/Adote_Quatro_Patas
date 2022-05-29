package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.usecase.port.AdoptionPort;
import br.com.drummond.quatropatas.adapter.controller.exception.AdoptedPetException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdoptionUseCase {
    private final AdoptionPort adoptionPort;

    public void adoptPet(String externalId) {
        if (!adoptionPort.isAdoptedPet(externalId)) {
            adoptionPort.adocao(externalId);
        }
        throw new AdoptedPetException("Pet adotado");
    }

}
