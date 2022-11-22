package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Client;
import com.example.mohamedjasserbensmida.entities.Facture;
import com.example.mohamedjasserbensmida.repositories.ClientRepository;
import com.example.mohamedjasserbensmida.repositories.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactureServiceImp implements FactureService{
     @Autowired
     FactureRepository factureRepository;
     @Autowired
    ClientRepository clientRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        if(client != null)
            f.setClient(client);
        return null;
    }


}
