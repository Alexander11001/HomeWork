package Lesson2.Ifelseif5;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя:");
        Scanner in= new Scanner(System.in);
        String name=in.nextLine();

        if (name.equals("Вася"))
        {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");

        }
        else if (name.equals("Анастасия"))
        {

            System.out.println("Я тебя так долго ждал");
        }

        else
        {
            System.out.println("Добрый день, а вы кто?");
        }



    }


}
