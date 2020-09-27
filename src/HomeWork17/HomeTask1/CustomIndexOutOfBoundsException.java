package HomeWork17.HomeTask1;

public class CustomIndexOutOfBoundsException extends Exception {
    public CustomIndexOutOfBoundsException() {
    }

    public CustomIndexOutOfBoundsException(String message) {
        super(message);
    }

    public CustomIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
