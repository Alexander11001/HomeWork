package Lesson3;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите первое число (все три числа не должны быть одинаковыми)");
        a = scan.nextInt();
        System.out.println("Введите второе число (все три числа не должны быть одинаковыми)");
        b = scan.nextInt();
        System.out.println("Введите третье число (все три числа не должны быть одинаковыми)");
        c = scan.nextInt();

        if ((a>b && a<c) | (a>c && a<b) )
        {
            System.out.println("Средне число: " +a);
        }
        else if ((b>a && b<c) | (b>c && b<a))
        {
            System.out.println("Средне число: " +b);
        }
        else if ((c>a && c<b) | (c>b && c<a))
        {
            System.out.println("Средне число: " +c);
        }
        else
        {
            System.out.println("Данные введены некорректно");
        }

    }


}
//Вводятся три разных числа. Найти, какое из них является средним (больше одного, но меньше другого).
