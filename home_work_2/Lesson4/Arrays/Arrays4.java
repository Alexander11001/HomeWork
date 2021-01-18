package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays4
{

    public static int[] Bubble(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < (array.length - 1); j++)
            {
                if (array[j + 1] < array[j])
                {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                }
            }
        }
        return array;
     }

    public static int[] shake(int array[]) {
        int a;
        int b = 0;
        int c = array.length - 1;
        do
            {
            for (int i = b; i < c; i++)
            {
                if (array[i] > array[i + 1])
                {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            c--;
            for (int i = c; i > b; i--)
            {
                if (array[i] < array[i - 1])
                {
                    a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                }
            }
            b++;
            }
        while (b < c);
        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion)
    {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            Random random = new Random();
            int a = random.nextInt(maxValueExclusion+1)-maxValueExclusion/2;
            array [i] = a;
        }
        return array;
    }

    public static int[] arrayFromConsole()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива и значения:");
        int a = scan.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++)
        {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray (int[] array) {
        if (array.length < 1) {
            System.out.println("Вы ввели пустой маасив");
        }
        else
            {
            for (int i : array)
            {
                System.out.print(i + "\t");
            }
            System.out.println(); //необязательно, для более легкого считывания значений в консоли
        }
    }

}