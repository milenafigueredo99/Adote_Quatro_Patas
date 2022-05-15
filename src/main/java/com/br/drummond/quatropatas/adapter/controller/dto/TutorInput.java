package com.br.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TutorInput {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("cidade")
    private String city;

    @JsonProperty("estado")
    private String state;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telefone")
    private String telephone;

}
