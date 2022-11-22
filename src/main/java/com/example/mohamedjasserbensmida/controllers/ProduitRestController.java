package com.example.mohamedjasserbensmida.controllers;

import com.example.mohamedjasserbensmida.entities.Produit;
import com.example.mohamedjasserbensmida.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitRestController {

    @Autowired
    ProduitService produitService;


    @GetMapping("/getAll")
    public List<Produit> retrieveAllProduits() {
        return produitService.retrieveAllProduits();
    }

    @GetMapping("/getOne/{idF}")
    public  Produit retrieveProduit( @PathVariable(value = "idP") Long id){
        return  produitService.retrieveProduit(id);
    }
    @PostMapping("/assign/{idf}/{idp}")
    public void assignFournisseurToProduit(@PathVariable("idf") Long idf,@PathVariable("idp") Long idp){
        produitService.assignFournisseurToProduit(idf,idp);
    }
    @GetMapping("/{idProduit}/{startDate}/{endDate}")
    public float getRevenuBrutProduit(@PathVariable(value = "idProduit") Long idProduit, @PathVariable(value = "startDate") Date startDate, @PathVariable(value = "endDate") Date endDate)
    {
        return produitService.getRevenuBrutProduit(idProduit,startDate,endDate);
    }



}
