package Lesson2.CommunicationPrinter;

public class welcomIfElse implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        if (name.equals("Вася"))
        {
            return ("Привет!" + "\n" +"Я тебя так долго ждал");
        }
        else if (name.equals("Анастасия"))
        {
            return ("Я тебя так долго ждал");
        }
        else
        {
            return ("Добрый день, а вы кто?");
        }
    }
}
