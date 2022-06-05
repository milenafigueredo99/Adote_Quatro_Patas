package br.com.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
@AllArgsConstructor
public class TutorInput {

    @JsonProperty("nome")
    @NotEmpty
    private String name;

    @NotEmpty
    @JsonProperty("cpf")
    private String cpf;

    @NotEmpty
    @JsonProperty("cidade")
    private String city;

    @NotEmpty
    @JsonProperty("estado")
    private String state;

    @NotEmpty
    @JsonProperty("email")
    private String email;

    @NotEmpty
    @JsonProperty("telefone")
    private String telephone;

}
