package Lesson3;
//пределить, является ли год, который ввел пользователем, високосным или невисокосным.
import java.util.Scanner;
//в решении не учитывались крайности вида "до введенеия григорианского календаря" и т.д.
public class LeapYear {
    public static void main(String[] args) {
        Scanner ent =new Scanner(System.in);
        System.out.println("Введите год:");
        int year = ent.nextInt();

        if  (year%400==0)
        {
            System.out.println("Введенный год - високосный");
        }
        else if (year%100==0)
        {
            System.out.println("Введеный год  - невисокосный ");

        }
        else if (year%4==0)
        {
            System.out.println("Введенный год - високосный");
        }
        else
        {
            System.out.println("Введеный год  - невисокосный ");
        }


    }

    }

