package Lesson2.CommunicationPrinter;

public interface ICommunicationPrinter {
    default String welcom(String name)
    {
        return null;
       }
}