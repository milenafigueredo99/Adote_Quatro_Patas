package com.br.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class PetInput {

    @NotNull
    @NotBlank
    @NotEmpty
    @JsonProperty("nome")
    private String name;

    @NotNull
    @JsonProperty("idade")
    private int age;

    @NotNull
    @NotEmpty
    @JsonProperty("especie")
    private String species;

    @NotNull
    @NotEmpty
    @JsonProperty("genero")
    private String gender;

    @NotNull
    @NotBlank
    @NotEmpty
    @JsonProperty("porte")
    private String size;

    @NotNull
    @JsonProperty("peso")
    private double weight;

    @NotNull
    @NotBlank
    @NotEmpty
    @JsonProperty("cidade")
    private String city;

    @NotNull
    @NotBlank
    @NotEmpty
    @JsonProperty("estado")
    private String state;

    @NotNull
    @NotBlank
    @NotEmpty
    @JsonProperty("deficiencia")
    private String deficiency;

}
