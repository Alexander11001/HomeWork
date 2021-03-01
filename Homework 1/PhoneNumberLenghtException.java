package Homework2;

public class PhoneNumberLenghtException extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public PhoneNumberLenghtException(String message, int num) {

        super(message);
        number = num;
    }
}
