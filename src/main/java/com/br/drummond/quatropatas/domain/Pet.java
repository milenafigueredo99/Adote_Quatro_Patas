package com.br.drummond.quatropatas.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Pet {

    private String name;
    private int age;
    private String species;
    private String gender;
    private String size;
    private double weight;
    private String address;
    private String deficiency;
}
