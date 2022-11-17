package com.example.mohamedjasserbensmida.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduit", nullable = false)
    private Long idProduit;


    private String codeProduit;
    private String libelleProduit;
    private float prix ;
    private Date dateCreation;
    private Date dateDernierModification;

    @ManyToOne
    private Stock stock;
    @OneToOne
    private DetailProduit detailProduit;

    @OneToMany(mappedBy = "facture")
    List<DetailFacture> detailFacture;

    @ManyToOne
    private Rayon rayon;
    @ManyToMany
    private List<Fournisseur> fournisseur;


}
