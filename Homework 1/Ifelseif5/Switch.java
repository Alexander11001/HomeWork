package Lesson2.Ifelseif5;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        Scanner in= new Scanner(System.in);
        String name=in.nextLine();

        switch (name)
        {
            case "Вася":
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
            break;
            case "Анастасия":
            System.out.println("Я тебя так долго ждал");
            break;
            default:
            System.out.println("Добрый день, а вы кто?");
        }
    }


}
