package com.br.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TutorUpdateInput {

    @NotNull
    @JsonProperty("nome")
    private String name;

    @NotNull
    @JsonProperty("cidade")
    private String city;

    @NotNull
    @JsonProperty("estado")
    private String state;

    @NotNull
    @JsonProperty("email")
    private String email;

    @NotNull
    @JsonProperty("telefone")
    private String telephone;

}
