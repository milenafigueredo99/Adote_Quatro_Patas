package com.br.drummond.quatropatas.adapter.repository.jpa.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tutor")
public class TutorEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cidade")
    private String city;

    @Column(name = "estado")
    private String state;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telephone;

}
