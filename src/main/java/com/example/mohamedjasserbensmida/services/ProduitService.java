package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Produit;

import java.util.List;

public interface ProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
