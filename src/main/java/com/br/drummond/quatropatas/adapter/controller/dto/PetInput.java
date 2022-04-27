package com.br.drummond.quatropatas.adapter.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PetInput {

    private String name;
    private String age;
    private String species;
    private String gender;
    private String size;
    private String weight;
    private String address;
    private boolean deficiency;

}
