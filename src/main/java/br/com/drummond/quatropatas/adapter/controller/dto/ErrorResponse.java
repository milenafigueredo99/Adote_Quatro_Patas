package br.com.drummond.quatropatas.adapter.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ErrorResponse {
    private List<ApiErrorDto> messages;

}
