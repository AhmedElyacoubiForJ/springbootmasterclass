package edu.yacoubi.springbootmasterclass.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

// what will the client receive
public record ApiExceptionDetails(
        String message,
        Throwable throwable,
        HttpStatus status,
        ZonedDateTime zonedDateTime) {
}
// private final, getter, public constructor, equals, hashcode
// to string
