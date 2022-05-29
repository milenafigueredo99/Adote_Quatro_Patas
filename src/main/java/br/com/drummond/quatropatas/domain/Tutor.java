package br.com.drummond.quatropatas.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Tutor {

    private String name;
    private String cpf;
    private String city;
    private String state;
    private String email;
    private String telephone;

}
