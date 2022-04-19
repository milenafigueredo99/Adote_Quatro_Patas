package com.br.drummond.quatropatas.usecase;

import com.br.drummond.quatropatas.domain.Pet;
import com.br.drummond.quatropatas.usecase.port.PetPort;
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

    public List<Pet> getAllPets(){
        return petPort.findAllPets();
    }
}
