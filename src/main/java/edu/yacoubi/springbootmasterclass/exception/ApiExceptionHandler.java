package edu.yacoubi.springbootmasterclass.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

// ApiExceptionHandler is the way how to handel more than one exception
// is like mapping ApiRequestException to ApiExceptionDetails

// these annotation is the way specify
// these class as global handler for the entire API
@ControllerAdvice
public class ApiExceptionHandler {

    // we can add more than one exception to be handled
    // @ExceptionHandler(value = {......})
    @ExceptionHandler(ApiRequestException.class)
    public ResponseEntity<Object> handelApiRequestException(
            ApiRequestException e) {

        ApiExceptionDetails apiExceptionDetails = new ApiExceptionDetails(
                e.getMessage(),
                e.getCause(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );

        return new ResponseEntity<>(
                apiExceptionDetails,
                HttpStatus.BAD_REQUEST);
    }
}
