package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Client;
import com.example.mohamedjasserbensmida.entities.Facture;

import java.util.List;

public interface ClientService {

    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);


    List<Facture> getFacturesByClient(Long idClient);

}
