package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Facture;

import java.util.List;

public interface FactureService {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);

    Facture addFacture(Facture f, Long idClient);
}
