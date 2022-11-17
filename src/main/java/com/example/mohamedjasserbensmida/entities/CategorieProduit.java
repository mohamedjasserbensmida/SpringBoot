package com.example.mohamedjasserbensmida.entities;

public enum CategorieProduit {


    ELECTROMENAGER("ELECTROMENAGER"),
    ALIMENTAIRE("ALIMENTAIRE"),
    QUINCAILLERIE("QUINCAILLERIE");

    private String categorieproduit ;

    CategorieProduit (String categorieproduit){
        this.categorieproduit = categorieproduit;
    }
}
