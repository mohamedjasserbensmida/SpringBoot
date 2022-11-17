package com.example.mohamedjasserbensmida.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailProduit", nullable = false)
    private Long idDetailProduit;
    private Date dateCreation ;
    private Date dateDerniereModification ;
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;
    @OneToOne(mappedBy = "detailProduit")
    private Produit produit ;
    @ManyToOne
    private Facture facture;
}
