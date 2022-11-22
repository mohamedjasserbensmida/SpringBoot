package com.example.mohamedjasserbensmida.repositories;

import com.example.mohamedjasserbensmida.entities.CategorieClient;
import com.example.mohamedjasserbensmida.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> getClientsByCategorieClient(CategorieClient categorieClient);
}
