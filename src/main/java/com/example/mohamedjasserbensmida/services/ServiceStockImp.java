package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Produit;
import com.example.mohamedjasserbensmida.entities.Stock;
import com.example.mohamedjasserbensmida.repositories.ProduitRepository;
import com.example.mohamedjasserbensmida.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceStockImp implements ServiceStock {
    @Autowired
    StockRepository stockRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
     stockRepository.deleteById(id);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = produitRepository.findById(idProduit).orElse(null);
        Stock s = stockRepository.findById(idStock).orElse(null);
        if(p!=null && s!=null){
         p.setStock(s);
         produitRepository.save(p);
        }
    }
}
