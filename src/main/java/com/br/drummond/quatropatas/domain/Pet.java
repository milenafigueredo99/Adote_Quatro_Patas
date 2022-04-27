package com.br.drummond.quatropatas.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Pet {

    private String name;
    private String age;
    private String species;
    private String gender;
    private String size;
    private String weight;
    private String address;
    private boolean deficiency;
}
