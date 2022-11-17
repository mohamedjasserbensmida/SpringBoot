package com.example.mohamedjasserbensmida.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailFacture", nullable = false)

    private long idDetailFacture;
    private int  qte ;
    private float prixTotal;
    private int pourcentageRemise;
    private int montantRemise;

    @ManyToOne
    private Facture facture;
}
