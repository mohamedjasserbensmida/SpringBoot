package com.example.mohamedjasserbensmida.entities;

public enum CategorieClient {
    FIDELE("FIDELE"),
    ORDINAIRE("ORDINAIRE"),
    PREMIUM("PREMIUM");

    private String categorieclient ;

    CategorieClient (String categorieclient){
        this.categorieclient = categorieclient;
    }
}
