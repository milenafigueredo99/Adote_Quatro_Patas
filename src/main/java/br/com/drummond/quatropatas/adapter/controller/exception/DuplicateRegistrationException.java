package br.com.drummond.quatropatas.adapter.controller.exception;

public class DuplicateRegistrationException extends RuntimeException {

    public DuplicateRegistrationException(String message) {
    super(message);
    }
}
