package br.com.drummond.quatropatas.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class Pet {

    private String id;
    private String name;
    private Integer age;
    private String species;
    private String gender;
    private String size;
    private Double weight;
    private String city;
    private String state;
    private String deficiency;
}
