package com.br.drummond.quatropatas.adapter.repository.jpa.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pet")
public class PetEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_externo")
    private String externalId;

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

    @Column(name ="adotado")
    private boolean adopted;

}
