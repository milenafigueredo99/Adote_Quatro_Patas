package com.br.drummond.quatropatas.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Tutor {

    private String name;
    private String cpf;
    private String address;
    private String email;
    private String telephone;

}
