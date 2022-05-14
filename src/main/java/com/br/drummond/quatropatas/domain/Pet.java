package com.br.drummond.quatropatas.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class Pet {

    private String externalId;
    private String name;
    private int age;
    private String species;
    private String gender;
    private String size;
    private double weight;
    private String city;
    private String state;
    private String deficiency;
}
