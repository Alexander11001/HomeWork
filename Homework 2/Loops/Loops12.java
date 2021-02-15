package Loops;

//еремножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ

import java.util.Scanner;
//1.1.2.* Используя рекурсию

public class Loops12 {
    public static long Factorial(long fact)
    {
        if (fact == 1)
        {
            return 1;
        }
        return fact * Factorial(fact - 1);
    }
    public static void main (String[]args)
    {
        int a = Integer.parseInt(args[0]);
        if (a > 20)
        {
            System.out.println("Превышен диапазон значения Long, введите меньшее значение");
        }
        else if (a < 1)
        {
            System.out.println("Введенное число не натуральное");
        }
        else if (a == 1)
        {
            System.out.println("1 = 1");
        }
        else
            {
                for (int i =1; i<=a;i++)
                {
                    if (i==a)
                    {
                        System.out.print(i);
                    }
                    else
                        {
                        System.out.print(i + " * ");
                        }
                }
                System.out.println(" = "+Factorial(a));
            }
        }
    }