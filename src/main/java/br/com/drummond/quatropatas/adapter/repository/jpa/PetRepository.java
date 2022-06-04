package br.com.drummond.quatropatas.adapter.repository.jpa;

import br.com.drummond.quatropatas.adapter.repository.jpa.model.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
    @Query("SELECT p FROM PetEntity p  WHERE p.adopted = 0")
    List<PetEntity> findPetNotAdopted();

    @Query("SELECT p FROM PetEntity p  WHERE p.tutor.id = ?1")
    List<PetEntity> findPetAdopted(Long tutor_id);

}
