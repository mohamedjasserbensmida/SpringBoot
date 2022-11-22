package com.example.mohamedjasserbensmida.repositories;

import com.example.mohamedjasserbensmida.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
