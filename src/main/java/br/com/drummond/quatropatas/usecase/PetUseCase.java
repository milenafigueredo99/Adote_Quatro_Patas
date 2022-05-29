package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.domain.Pet;
import br.com.drummond.quatropatas.usecase.port.PetPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetUseCase {

    private final PetPort petPort;

    public void registration(Pet pet) {
        petPort.register(pet);
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
}
