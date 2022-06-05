package br.com.drummond.quatropatas.adapter.controller.exception;

import br.com.drummond.quatropatas.adapter.controller.dto.ApiErrorDto;
import br.com.drummond.quatropatas.adapter.controller.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        var apiErrorDTO = ApiErrorDto.builder()
                .code("500")
                .message("Serviço indisponível")
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse.builder()
                        .messages(List.of(apiErrorDTO))
                        .build());
    }

    @ExceptionHandler(UnregisteredPetException.class)
    public  ResponseEntity<ErrorResponse> handleUnregisteredPetException(UnregisteredPetException ex){
        var apiErrorDTO = ApiErrorDto.builder()
                .code(HttpStatus.BAD_REQUEST.name())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder()
                        .messages(List.of(apiErrorDTO))
                        .build());
    }

    @ExceptionHandler(UnregisteredTutor.class)
    public  ResponseEntity<ErrorResponse> handleUnregisteredTutor(UnregisteredTutor ex){
        var apiErrorDTO = ApiErrorDto.builder()
                .code(HttpStatus.BAD_REQUEST.name())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder()
                        .messages(List.of(apiErrorDTO))
                        .build());
    }

    @ExceptionHandler(DuplicateRegistrationException.class)
    public  ResponseEntity<ErrorResponse> handleDuplicateRegistrationException(DuplicateRegistrationException ex){
        var apiErrorDTO = ApiErrorDto.builder()
                .code(HttpStatus.BAD_REQUEST.name())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder()
                        .messages(List.of(apiErrorDTO))
                        .build());
    }

    @ExceptionHandler(AdoptedPetException.class)
    public  ResponseEntity<ErrorResponse> handleAdoptedPetException(AdoptedPetException ex){
        var apiErrorDTO = ApiErrorDto.builder()
                .code(HttpStatus.BAD_REQUEST.name())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder()
                        .messages(List.of(apiErrorDTO))
                        .build());
    }
}
