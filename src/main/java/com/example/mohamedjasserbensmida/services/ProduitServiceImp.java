package com.example.mohamedjasserbensmida.services;


import com.example.mohamedjasserbensmida.entities.Fournisseur;
import com.example.mohamedjasserbensmida.entities.Produit;
import com.example.mohamedjasserbensmida.repositories.FournisseurRepository;
import com.example.mohamedjasserbensmida.repositories.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProduitServiceImp implements  ProduitService{

    @Autowired
    ProduitRepository produitRepository;

    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return null ;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
     Fournisseur f = fournisseurRepository.findById(fournisseurId).orElse(null);
     Produit p = produitRepository.findById(produitId).orElse(null);
     if(f!=null && p!=null){
         p.getFournisseur().add(f);
         produitRepository.save(p);
     }
    }
}
