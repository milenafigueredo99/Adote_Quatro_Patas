package br.com.drummond.quatropatas.adapter.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiErrorDto {

    private String code;
    private String message;

}
