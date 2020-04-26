package edu.codeschool.training.iterator;

public class CustomIndexOutOfBoundsException extends Exception {
    public CustomIndexOutOfBoundsException(String message) {
        super(message);
    }

    public CustomIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
