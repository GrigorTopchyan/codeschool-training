package edu.training.codeschool.exceptions.homework_2;

public class IllegalPasswordException extends RuntimeException {
    public IllegalPasswordException() {
    }

    public IllegalPasswordException(String message) {
        super(message);
    }

}
