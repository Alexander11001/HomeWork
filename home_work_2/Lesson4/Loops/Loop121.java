package Loops;

//Все цифры из числа введенного через аргумент к исполняемой программе перемножить между
// собой и вывести ход вычислений в консоль.
// Пользователь обязан ввести целое число. Если ввели
// не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

import java.util.Scanner;
public class Loop121
{
    public static void Multi (int b)
    {
        int q = 1;
        while (b != 0)
        {
            int c = b % 10;
            b /=10;
            q*=c;
            if (b>0)
            {
                System.out.print(c + " * ");
            }
            else
            {
                System.out.print(+c);
            }
            if (b == 0)
            {
                System.out.println(" = " + q);
            }
        }
    }

    public static boolean existNotDigit(char[] chars)
    {
        boolean result = false;
        for (int i = 0; i < chars.length; i++)
        {
            if(!Character.isDigit(chars[i]))
            {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
       String str=args[0];
       if(str.charAt(0) == '-')
        {
            System.out.println("Вы ввели отрицательное число");
        }
        else
            {
                char[] chars = str.toCharArray();
                if(existNotDigit(chars))
                {
                    System.out.println("Ваше число содержит недопустимые символы");
                }
                else
                    {
                        int value = Integer.parseInt(str);
                        Multi(value);
                    }
            }
    }
}



