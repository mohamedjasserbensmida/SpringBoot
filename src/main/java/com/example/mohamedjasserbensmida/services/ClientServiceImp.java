package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Client;
import com.example.mohamedjasserbensmida.entities.Facture;
import com.example.mohamedjasserbensmida.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImp implements ClientService{
    @Autowired
    ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
      clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
     Client c = clientRepository.findById(idClient).orElse(null);
     if(c!=null){
     return c.getFacture();
     }
     return null;
    }
}
