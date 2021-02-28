package Lesson2.CommunicationPrinter;

public class welcomIf implements ICommunicationPrinter {
    @Override
    public String welcom (String name) {
        if (name.equals("Вася")) {
            return "Привет!" + "\n" + "Я тебя так долго ждал";

        }
        if (name.equals("Анастасия")) {
            return "Я тебя так долго ждал";
        }

        return "Добрый день, а вы кто?";
    }
}
