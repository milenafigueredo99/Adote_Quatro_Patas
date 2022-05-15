package com.br.drummond.quatropatas.adapter.repository.jpa;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TutorRepository extends JpaRepository<TutorEntity, Long> {

    @Query("SELECT t FROM TutorEntity t  WHERE t.cpf = ?1")
    Optional<TutorEntity> exitsByCpf(String cpf);

    @Modifying
    @Query("DELETE FROM TutorEntity t  WHERE t.cpf = ?1")
    void deleteByCpf(String cpf);
}
