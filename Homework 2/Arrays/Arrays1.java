package Arrays;


//	2.2 Перебор массива при помощи do....while, while, for, foreach.
////	Элементы массива вводить используя метод arrayFromConsole(). Все задачи в одном классе, в отдельных методах.
////		2.2.1 Вывести все элементы в консоль.
////		2.2.2 Вывести каждый второй элемент массива в консоль.
////		2.2.3 Вывести все элементы массива в консоль в обратном порядке.

import java.util.Random;
import java.util.Scanner;

public class Arrays1
{
 //2.1 Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива
// и каждый его элемент запрашивает у пользователя через консоль. Пример int[] container = arrayFromConsole().
// Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (5)
// и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 5 с элементами {4, 17, 32} и
// сохранён в переменную container.

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
//2.2.1 Вывести все элементы в консоль.
    public static void printArray (int[] array)
    {
        for (int i : array)
        {
            System.out.print(i+"\t");
        }
        System.out.println(); //необязательно, для более легкого считывания значений в консоли
        }
////		2.2.2 Вывести каждый второй элемент массива в консоль.
    public static void printSecond (int[] array)
    {
        for (int i = 1; i < array.length; i=i+2)//второй элемент массива идет с индексом 1
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
//Вывести все элементы массива в консоль в обратном порядке
    public static void backArray (int[] array)
    {
        for (int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    //2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
    // Данный метод принимает два аргумента.
    // Первый (size) указывает размер массива который мы хотим получить.
    // Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
    // Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив
    // размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.

    public static int[] arrayRandom(int size, int maxValueExclusion)
    {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            Random random = new Random();
            int a = random.nextInt(maxValueExclusion+1);
            array [i] = a;
        }
        return array;
    }

        public static void main (String[]args)
        {
            int[] container = arrayFromConsole();
            printArray(container);
            printSecond (container);
            backArray (container);
            int[] container2 = arrayRandom(5,100);
            printArray(container2);
        }
}
