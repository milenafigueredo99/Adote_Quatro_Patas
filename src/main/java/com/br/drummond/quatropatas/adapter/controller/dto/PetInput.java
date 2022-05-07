package com.br.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PetInput {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("idade")
    private int age;

    @JsonProperty("especie")
    private String species;

    @JsonProperty("genero")
    private String gender;

    @JsonProperty("porte")
    private String size;

    @JsonProperty("peso")
    private double weight;

    @JsonProperty("endereco")
    private String address;

    @JsonProperty("deficiencia")
    private String deficiency;

}
