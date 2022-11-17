package com.example.mohamedjasserbensmida.repositories;

import com.example.mohamedjasserbensmida.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
