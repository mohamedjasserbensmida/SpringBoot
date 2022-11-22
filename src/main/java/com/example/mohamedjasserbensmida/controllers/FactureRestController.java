package com.example.mohamedjasserbensmida.controllers;


import com.example.mohamedjasserbensmida.entities.Facture;
import com.example.mohamedjasserbensmida.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("facture")
public class FactureRestController {

    @Autowired
    FactureService factureService;




    @GetMapping()
    public List<Facture> retrieveAllFactures()
    {
        return factureService.retrieveAllFactures();
    }

    @DeleteMapping("/{idFacture}")
    public void cancelFacture(@PathVariable(value = "idFacture") long idFacture)
    {
        factureService.cancelFacture(idFacture);
    }
    @GetMapping("/{idFacture}")
    public Facture retrieveFacture(@PathVariable(value = "idFacture") long idFacture)
    {
        return factureService.retrieveFacture(idFacture);
    }
    @PostMapping("/{idClient}")
    public Facture addFacture(@RequestBody Facture f, @PathVariable(value = "idClient") Long idClient)
    {
        return factureService.addFacture(f,idClient);
    }
}
