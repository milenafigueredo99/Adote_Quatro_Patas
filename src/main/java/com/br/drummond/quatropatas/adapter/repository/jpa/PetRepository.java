package com.br.drummond.quatropatas.adapter.repository.jpa;

import com.br.drummond.quatropatas.adapter.repository.jpa.model.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
}
