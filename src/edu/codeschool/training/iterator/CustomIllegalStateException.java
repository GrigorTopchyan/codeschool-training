package edu.codeschool.training.iterator;

public class CustomIllegalStateException extends Exception {
    public CustomIllegalStateException(String message) {
        super(message);
    }

    public CustomIllegalStateException(String message, Throwable cause) {
        super(message, cause);
    }
}
