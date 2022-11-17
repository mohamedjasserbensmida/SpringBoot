package com.example.mohamedjasserbensmida.entities;

public enum Profession {
    DOCTEUR("DOCTEUR"),
    INGENIEUR("INGENIEUR"),
    ETUDIANT("ETUDIANT"),
    COMMERCIALE("COMMERCIALE"),
    CADRE("CADRE"),
    AUTRE("AUTRE");


    private String profession ;

    Profession (String profession){
        this.profession = profession;
    }
}
