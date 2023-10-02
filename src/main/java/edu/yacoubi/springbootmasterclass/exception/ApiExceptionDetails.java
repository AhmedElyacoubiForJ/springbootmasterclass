package edu.yacoubi.springbootmasterclass.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

// what will the client receive
@Data
public class ApiExceptionDetails {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus status;
    private final ZonedDateTime zonedDateTime;
}
