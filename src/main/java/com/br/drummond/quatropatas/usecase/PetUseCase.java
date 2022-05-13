package com.br.drummond.quatropatas.usecase;

import com.br.drummond.quatropatas.domain.Pet;
import com.br.drummond.quatropatas.usecase.port.PetPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PetUseCase {

    private final PetPort petPort;

    public void registration(Pet pet) {
        var petWithExternalId = pet.toBuilder()
                .externalId(UUID.randomUUID().toString())
                .build();
        petPort.register(petWithExternalId);
    }

    public List<Pet> getAllPets() {
        return petPort.findAllPets();
    }

    public void deleteRegister(String externalId) {
        petPort.deletePetByExternalId(externalId);
    }
}
