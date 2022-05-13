package com.br.drummond.quatropatas.usecase;

import com.br.drummond.quatropatas.adapter.controller.exception.AdoptedPetException;
import com.br.drummond.quatropatas.usecase.port.AdoptionPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdoptionUseCase {
    private final AdoptionPort adoptionPort;

    public void adoptPet(String externalId) {
        if (!adoptionPort.isAdoptedPet(externalId)) {
            adoptionPort.adocao(externalId);

            List.of()
        }
        throw new AdoptedPetException("Pet adotado");
    }

}
