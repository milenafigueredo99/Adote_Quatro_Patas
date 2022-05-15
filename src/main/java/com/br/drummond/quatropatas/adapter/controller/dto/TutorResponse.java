package com.br.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TutorResponse {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("cidade")
    private String city;

    @JsonProperty("estado")
    private String state;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telefone")
    private String telephone;

}
