package com.br.drummond.quatropatas.adapter.repository.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pet")
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="nome")
    private String name;

    @Column(name ="idade")
    private int age;

    @Column(name ="especie")
    private String species;

    @Column(name ="genero")
    private String gender;

    @Column(name ="porte")
    private String size;

    @Column(name ="peso")
    private double weight;

    @Column(name ="endereco")
    private String address;

    @Column(name ="deficiencia")
    private String deficiency;

}
