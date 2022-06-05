package br.com.drummond.quatropatas.adapter.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiErrorDto {

    @JsonProperty("codigo")
    private String code;

    @JsonProperty("mensagem")
    private String message;

}
