package br.com.drummond.quatropatas.adapter.repository;

import br.com.drummond.quatropatas.adapter.repository.jpa.PetRepository;
import br.com.drummond.quatropatas.usecase.port.AdoptionPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdoptionGateway implements AdoptionPort {

    private final PetRepository petRepository;

    public boolean isAdoptedPet(String externalId) {
        return petRepository.existsByExternalId(externalId);
    }

    @Override
    public void adocao(String externalId) {
        var pet = petRepository.getPet(externalId).get();
        pet.setAdopted(true);

        petRepository.save(pet);
    }
}
