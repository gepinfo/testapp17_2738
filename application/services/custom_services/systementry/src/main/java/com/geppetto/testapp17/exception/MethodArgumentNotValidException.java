package com.geppetto.testapp17.exception;

public class MethodArgumentNotValidException extends RuntimeException {

public MethodArgumentNotValidException(String message) {
super(message);
}

public MethodArgumentNotValidException(String message, Throwable cause) {
super(message, cause);
}
}
