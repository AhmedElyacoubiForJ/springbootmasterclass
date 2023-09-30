package edu.yacoubi.springbootmasterclass.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

// what will the client receive
public class ApiExceptionDetails {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus status;
    private final ZonedDateTime zonedDateTime;

    public ApiExceptionDetails(String message,
                               Throwable throwable,
                               HttpStatus status,
                               ZonedDateTime zonedDateTime) {
        this.message = message;
        this.throwable = throwable;
        this.status = status;
        this.zonedDateTime = zonedDateTime;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "message='" + message + '\'' +
                ", throwable=" + throwable +
                ", status=" + status +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }
}
