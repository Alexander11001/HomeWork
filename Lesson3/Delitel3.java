package Lesson3;

import java.util.Scanner;

public class Delitel3 {
    public static void main(String[] args) {
    int a,b;
    Scanner scan =new Scanner(System.in);
    System.out.println("Введите числитель");
    a = scan.nextInt();
    System.out.println("Введите знаментаель");
    b = scan.nextInt();

    if (b==0)
    {
        System.out.println("Вы пытались разделить на ноль");
    }
    else if (a%b==0) //если а =0 то тоже поадает сюда, т.к. ноль делится без остатка на любое число
    {
        System.out.println("Число " +a +" делится без остатка на число " + b );
    }
    else
    {
        System.out.println("Число " +a +" не делится без остатка на число " + b + ", остаток от деления равен " + a%b);
    }

    if (b!=0)
    {
        System.out.println("Результат от деления равен " + a / b);
    }



}
}




//Если первое число нацело делится на второе, то вывести сообщение об этом.
//Иначе вывести сообщение о том, что первое число не делится на второе, найти остаток от деления и также вывести его.
//В конце программы найти частное от деления чисел и вывести его.