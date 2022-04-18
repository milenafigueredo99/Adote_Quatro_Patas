package com.br.drummond.quatropatas.adapter.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorDto {

    private String code;
    private String title;
    private String detail;
}
