package Lesson3;

import java.util.Scanner;

public class Nechet1 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите первое число (одно из чисел должно быть четное, одно - нечетное");
        a = scan.nextInt();
        System.out.println("Введите второе число (одно из чисел должно быть четное, одно - нечетное");
        b = scan.nextInt();

        if (a%2!=0)
        {
            System.out.println("Число "+ a+ " нечетное");

        }
        else if (b%2!=0)
        {
            System.out.println("Число "+ b+ " нечетное");
        }
        else
        {
            System.out.println("Данные введены некорректно");
        }

    }
}


//Из двух случайных чисел, одно из которых четное, а другое нечетное, определить и вывести на экран нечетное число.



