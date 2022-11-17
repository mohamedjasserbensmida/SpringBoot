package com.example.mohamedjasserbensmida.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFournisseur", nullable = false)
      private  long idFournisseur;
      private String codeFournisseur;
      private String libelleFournisseur;


      @ManyToMany(mappedBy = "fournisseur")
      List<Produit> produit;
}
