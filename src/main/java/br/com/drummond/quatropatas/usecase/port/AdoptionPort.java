package br.com.drummond.quatropatas.usecase.port;

import br.com.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import br.com.drummond.quatropatas.domain.Pet;

import java.util.List;

public interface AdoptionPort {
      void adoption(Long id, TutorEntity tutor);
      List<Pet> allAdoptedPetsByCpf(String cpf);

}
