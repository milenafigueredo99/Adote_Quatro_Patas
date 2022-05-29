package br.com.drummond.quatropatas.usecase.port;

public interface AdoptionPort {
    boolean isAdoptedPet(String externalId);

    void adocao(String externalId);
}
