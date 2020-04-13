package edu.codeschool.training.classes_objects.exception.Task2;

public class IllegalPasswordException extends RuntimeException {
    String message;

    public IllegalPasswordException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void IllegalPasswordException1(String message) throws Throwable  {
        try {

        } catch (Throwable ex) {
            throw new Throwable("Message could not be sent", ex);
        }
    }
}
