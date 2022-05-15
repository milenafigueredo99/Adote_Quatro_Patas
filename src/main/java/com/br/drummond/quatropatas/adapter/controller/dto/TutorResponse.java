package com.br.drummond.quatropatas.adapter.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TutorResponse {

    private String name;
    private String address;
    private String email;
    private String telephone;

}
