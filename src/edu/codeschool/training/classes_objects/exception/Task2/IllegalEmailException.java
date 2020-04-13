package edu.codeschool.training.classes_objects.exception.Task2;

public class IllegalEmailException extends RuntimeException {
    public IllegalEmailException(String message) {
        super(message);
    }
    public IllegalEmailException(String message,Throwable ex){
        super(message, ex);
    }
}


