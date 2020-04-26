package edu.codeschool.training.exceptions;

public class IllegalEmailException extends RuntimeException {
    public IllegalEmailException(String message) {
        super(message);
    }

    public IllegalEmailException(String message, Throwable cause) {
        super(message, cause);
    }

}
