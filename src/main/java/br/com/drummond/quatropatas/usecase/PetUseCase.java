package br.com.drummond.quatropatas.usecase;

import br.com.drummond.quatropatas.domain.Pet;
import br.com.drummond.quatropatas.usecase.port.PetPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

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

    @Transactional
    public void deleteRegister(Long id) {
        petPort.deletePetById(id);
    }

    public void updateRegister(Long id, Pet pet) {
        petPort.updatePet(id, pet);
    }


}

