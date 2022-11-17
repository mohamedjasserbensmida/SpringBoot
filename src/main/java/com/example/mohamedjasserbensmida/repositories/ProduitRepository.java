package com.example.mohamedjasserbensmida.repositories;

import com.example.mohamedjasserbensmida.entities.Produit;
import org.springframework.boot.json.JsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
