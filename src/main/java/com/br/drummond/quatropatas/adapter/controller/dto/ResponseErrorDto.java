package com.br.drummond.quatropatas.adapter.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder
public class ResponseErrorDto {

    @Singular
    private List<ErrorDto> errors;


}
