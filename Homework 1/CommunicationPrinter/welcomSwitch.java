package Lesson2.CommunicationPrinter;

public class welcomSwitch implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        switch (name)
        {
            case "Вася":
                return ("Привет!" + "\n" +"Я тебя так долго ждал");

            case "Анастасия":
                return ("Я тебя так долго ждал");

            default:
                return ("Добрый день, а вы кто?");
        }
    }
}
