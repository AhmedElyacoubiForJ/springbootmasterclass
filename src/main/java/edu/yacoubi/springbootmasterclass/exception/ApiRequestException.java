package edu.yacoubi.springbootmasterclass.exception;

// what will be to throw in code
public class ApiRequestException extends RuntimeException {

    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message,
                               Throwable cause) {
        super(message, cause);
    }
}
