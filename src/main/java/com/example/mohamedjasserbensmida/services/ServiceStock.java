package com.example.mohamedjasserbensmida.services;

import com.example.mohamedjasserbensmida.entities.Stock;

import java.util.List;

public interface ServiceStock {

    List<Stock> retrieveAllStocks();
    Stock addStock(Stock s);
    Stock updateStock(Stock s);
    Stock retrieveStock(Long id);
    void removeStock(Long id);

    public void assignProduitToStock(Long idProduit, Long idStock);
}
