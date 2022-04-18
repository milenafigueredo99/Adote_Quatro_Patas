package com.br.drummond.quatropatas.adapter.repository;

import com.br.drummond.quatropatas.adapter.controller.dto.ErrorDto;
import com.br.drummond.quatropatas.adapter.controller.dto.ResponseErrorDto;
import com.br.drummond.quatropatas.adapter.controller.exception.DuplicateRegistrationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> handleDuplicateRegistrationException(DuplicateRegistrationException ex, WebRequest request) {
        return handleExceptionInternal(ex, null, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        body = ResponseErrorDto.builder()
                .error(ErrorDto.builder()
                        .code(Integer.toString(status.value()))
                        .title(status.name())
                        .detail(ex.getMessage())
                        .build())
                .build();

        return super.handleExceptionInternal(ex, body, headers, status, request);
    }
}
