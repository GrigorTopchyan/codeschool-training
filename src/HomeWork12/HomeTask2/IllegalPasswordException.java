package HomeWork12.HomeTask2;

public class IllegalPasswordException extends RuntimeException {
    public IllegalPasswordException(String message) {
        super(message);
    }

    public IllegalPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
