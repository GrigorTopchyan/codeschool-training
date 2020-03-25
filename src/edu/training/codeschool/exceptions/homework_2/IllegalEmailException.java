package edu.training.codeschool.exceptions.homework_2;

public class IllegalEmailException extends RuntimeException {
    public IllegalEmailException(String message) {
        super(message);
    }

    public IllegalEmailException(String message, Throwable cause) {
        super(message, cause);
    }
}
