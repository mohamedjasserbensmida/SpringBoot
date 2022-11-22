package com.example.mohamedjasserbensmida.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient", nullable = false)
    private  long idClient;
    private String nom ;
    private String prenom;
    private Date dateNaissance;
    private String email ;
    private  String password;

    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient;
    @Enumerated(EnumType.STRING)
    private Profession profession;
    @OneToMany(mappedBy = "client")
    List<Facture> facture ;

}
