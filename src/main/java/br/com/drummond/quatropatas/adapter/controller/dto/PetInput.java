package br.com.drummond.quatropatas.adapter.controller.dto;

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
    @JsonProperty("nome")
    private String name;

    @JsonProperty("idade")
    private Integer age;

    @NotNull
    @JsonProperty("especie")
    private String species;

    @NotNull
    @JsonProperty("genero")
    private String gender;

    @NotNull
    @JsonProperty("porte")
    private String size;

    @JsonProperty("peso")
    private Double weight;

    @NotNull
    @JsonProperty("cidade")
    private String city;

    @NotNull
    @JsonProperty("estado")
    private String state;

    @NotNull
    @JsonProperty("deficiencia")
    private String deficiency;

}
