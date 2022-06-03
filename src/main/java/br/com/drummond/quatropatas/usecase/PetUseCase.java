package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.domain.Pet;
import br.com.drummond.quatropatas.usecase.port.PetPort;
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
                .externalId(buildExternalId())
                .build();
        petPort.register(petWithExternalId);
    }

    public List<Pet> getAllPets() {
        return petPort.findAllPets();
    }

    public void deleteRegister(String externalId) {
        petPort.deletePetByExternalId(externalId);
    }

    public void updateRegister(String externalId, Pet pet) {
        petPort.updatePet(externalId, pet);
    }

    private String buildExternalId(){
        return String.valueOf(Integer.valueOf((int) Math.floor(Math.random() * 10 + 1)));
    }
}
