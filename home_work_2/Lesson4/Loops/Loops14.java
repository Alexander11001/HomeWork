package Loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Loops14 {
//    1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
//    В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
//    	1.4.1. 3
//    	1.4.2. 188
//    	1.4.3. -19
//    	1.4.4. Да и вообще на любое целочисленное
    //-9, 223, 372, 036, 854, 775, 808
    // 9, 223, 372, 036, 854, 775, 807
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число, на которое будет умножаться long a = 1");
        int q= scan.nextInt();
        long a = 1L;
        long c =-9223372036854775808L;
        while (Math.abs(a)< Math.abs(c/q))
        {
            a*=q;
            //Два оператора if нужны для корректного заполнения "крайних" значений со степенями двойки и -2
            // соответсвенно, т.к. для LONG крайние значения по модулю
            //не совпадают (-...808 для отрицательных чисел, ....807 для положительных).
                if (a==c/q)
                {
                    System.out.println("Число до переполнения: " + c);
                    BigInteger w = BigInteger.valueOf(c);
                    BigInteger t = BigInteger.valueOf(q);
                    BigInteger y =w.multiply(t);
                    System.out.println ("Число после переполнения: " + y);
                }
                else if (Math.abs(a)>=Math.abs(c/q))
                {
                    System.out.println("Число до переполнения: " + a);
                    BigInteger w = BigInteger.valueOf(a);
                    BigInteger t = BigInteger.valueOf(q);
                    BigInteger y =w.multiply(t);
                    System.out.println ("Число после переполнения: " + y);
                }
        }
    }
}
