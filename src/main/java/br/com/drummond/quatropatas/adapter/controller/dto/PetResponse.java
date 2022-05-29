package br.com.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PetResponse {

    @JsonProperty("id")
    private String externalId;

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

    @JsonProperty("cidade")
    private String city;

    @JsonProperty("estado")
    private String state;

    @JsonProperty("deficiencia")
    private String deficiency;
}
