package br.com.drummond.quatropatas.adapter.controller.exception;

public class UnregisteredPetException extends RuntimeException {

    public UnregisteredPetException(String message) {
        super(message);
    }
}
