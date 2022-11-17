package com.example.mohamedjasserbensmida.controllers;


import com.example.mohamedjasserbensmida.entities.Stock;
import com.example.mohamedjasserbensmida.services.ServiceStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("stock")
public class StockRestController {
    @Autowired
    ServiceStock serviceStock;
    @GetMapping("retrieveAllStocks")
    public List<Stock> retrieveAllStocks(){
        return serviceStock.retrieveAllStocks();
    }
    @PostMapping("/AddStock")
    public Stock addStock(Stock s){
        return serviceStock.addStock(s);
    }
    @DeleteMapping("DeleteStock/{id}")
    public void deleteStock(@PathVariable long id){serviceStock.removeStock(id);
    }
    @PostMapping("UpdateStock")
    public Stock updateStock(Stock s){return  serviceStock.updateStock(s); }
    @GetMapping("retrieveStocks/{ids}")
    public Stock retrieveStock(@PathVariable long id){
        return serviceStock.retrieveStock(id);
    }
    @PostMapping("/assign/{idp}/{ids}")
    public void assignProduitToStock(@PathVariable("idp") Long idp,@PathVariable("ids") Long ids){
        serviceStock.assignProduitToStock(idp,ids);
    }
}
