package com.example.mohamedjasserbensmida.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFacture", nullable = false)
    private Long idFacture;


    private float montantRemise;
    private float montantFacture;
    private Date dateFacture;
    private boolean active ;

    @OneToMany(mappedBy = "facture")
    List<DetailFacture> detailFacture;

    @ManyToOne
    private Client client;
}
