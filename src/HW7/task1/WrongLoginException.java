package HW7.task1;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
