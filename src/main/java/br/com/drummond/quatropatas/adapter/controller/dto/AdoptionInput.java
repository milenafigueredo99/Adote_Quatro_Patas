package br.com.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AdoptionInput {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("cpf")
    private String cpf;

}
