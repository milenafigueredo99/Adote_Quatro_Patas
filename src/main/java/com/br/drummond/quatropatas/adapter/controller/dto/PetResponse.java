package com.br.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PetResponse {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("idade")
    private String age;

    @JsonProperty("especie")
    private String species;

    @JsonProperty("genero")
    private String gender;

    @JsonProperty("porte")
    private String size;

    @JsonProperty("peso")
    private String weight;

    @JsonProperty("endereco")
    private String address;

    @JsonProperty("deficiencia")
    private String deficiency;
}
