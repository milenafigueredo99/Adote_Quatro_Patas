package com.br.drummond.quatropatas.adapter.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class PetResponse {

    private String name;
    private String age;
    private String species;
    private String gender;
    private String size;
    private String weight;
    private String address;
    private boolean deficiency;

}
