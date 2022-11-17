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
public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRayon", nullable = false)

    private Long idRayon;
    private String codeRayon;
    private String libelleRayon;

    @OneToMany(mappedBy = "rayon")
    List<Produit> produit ;
}
