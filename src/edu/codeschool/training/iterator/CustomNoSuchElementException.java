package edu.codeschool.training.iterator;

public class CustomNoSuchElementException extends Throwable {
    public CustomNoSuchElementException(String message) {
        super(message);
    }

    public CustomNoSuchElementException(String message, Throwable cause) {
        super(message, cause);
    }
}
