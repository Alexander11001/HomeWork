package Loops;
// 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//    	1.1.1. Используя только цикл
import java.util.Scanner;

public class Loops1
{
    public static void main(String[] args)
    {
        long c=1L;
        int a = Integer.parseInt(args[0]);
        if (a>20)
        {
            System.out.println("Превышен диапазон значения Long, введите меньшее значение");
        }
        else if (a<1)
        {
            System.out.println("Введенное число не натуральное");
        }
        else
        {
            for (int i=1; i<=a; i++)
            {
                c*=i;
                if (i==a)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i + " * ");
                }
            }
            System.out.println(" = "+c);
        }
    }
}