package com.example.mohamedjasserbensmida.repositories;

import com.example.mohamedjasserbensmida.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
