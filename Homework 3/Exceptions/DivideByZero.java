package Homework5OOP.Exceptions;


public class DivideByZero extends IllegalArgumentException{
    public DivideByZero() {
        super("Деление на 0 запрещено");
    }

    public DivideByZero(String s) {
        super(s);
    }

    public DivideByZero(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZero(Throwable cause) {
        super(cause);
    }
}
