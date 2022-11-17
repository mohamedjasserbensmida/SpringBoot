package com.example.mohamedjasserbensmida.controllers;

import com.example.mohamedjasserbensmida.entities.Client;
import com.example.mohamedjasserbensmida.entities.Facture;
import com.example.mohamedjasserbensmida.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;
@RestController
@RequestMapping("client")
public class ClientRestController {

    @Autowired
    ClientService clientService;


    @GetMapping("retrieveAllClient")
    public List<Client> retrieveAllClients(){
        return clientService.retrieveAllClients();
    }
    @PostMapping("/AddClient")
    public Client addClient(Client c){
        return clientService.addClient(c);
    }
    @DeleteMapping("DeleteEtuiant/{id}")
    public void deleteClient(@PathVariable long id){clientService.deleteClient(id);
    }
    @PostMapping("UpdateClient")
    public Client updateClient(Client c){return  clientService.updateClient(c); }
    @GetMapping("Facture/{idc}")
    public List<Facture> getFacturesByClient(Long idClient){return clientService.getFacturesByClient(idClient);}
}
