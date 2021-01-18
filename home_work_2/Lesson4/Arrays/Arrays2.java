package Arrays;

import java.util.Random;

public class Arrays2
{

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

    public static void printArray (int[] array)
    {
        for (int i : array)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    //В массиве, содержащем положительные и отрицательные целые числа,
    // вычислить сумму четных положительных элементов.

    public static int sum (int[] array)
    {
        int a=0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i]%2==0 && array[i]>0)
        {
            a+=array[i];
        }
        }
        System.out.println(a);
        return a;
    }

      //среди элементов массива с четными индексами, найти тот, который имеет максимальное значение.

    public static int max (int[] array)
    {
        int a=array[1];
        for (int i = 1; i < (array.length); i=i+2) //второй (четный) элемент массива идет с индексом 1
        {
            if (array [i]>a)
            {
                a=array[i];
            }
        }
        System.out.println(a);
        return array[a];
    }

    //Найти в массиве те элементы, значение которых меньше среднего арифметического,
    // взятого от всех элементов массива.

    public static void maxAr (int[] array)
    {
        int a=0;
        for (int i = 0; i < array.length; i++)
        {
            a+=array[i];
        }
        int c=a/array.length;
        System.out.println("Среднее арифмитическое: "+c);
        System.out.print("Элементы массива, которые меньше среднего арифмитического: ");
        for (int i = 0; i < (array.length); i++)
        {
           if(array[i]<c)
           {
               System.out.print(array[i] + "\t");
           }
        }
    }

    //В одномерном массиве целых чисел определить два наименьших элемента.
    // Они могут быть как равны между собой (оба являться минимальными), так и различаться.

    public static int[] minTwo (int[] array)
    {
        int a=array[0];
        int b= 0;
        int c=array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < a)
            {
                a = array[i];
                b = i;
            }
        }
            for (int j = 0; j < array.length ; j++)
            {
                if (j==b)
                {
                    continue;
                }
                else if (array [j]<c)
                {
                    c = array[j];
                }
                }
        int [] minTwo = new int [2];
            minTwo [0]=a;
            minTwo [1]=c;
            return minTwo;
    }


//Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
// Освободившиеся в конце массива элементы заполнить нулями.

    public static int[] shrink (int[] array, int a, int b)
    {int i=0;
    //int newArrayLenght = array.length - (b-a+1);
    int [] shrinkarray = new int [array.length];
        while (i<a)
        {
        shrinkarray [i]=array [i];
        i++;
        }
        i=a;
        int r=b;
        while (i<(shrinkarray.length- (b-a+1)))
        {
            shrinkarray [i]=array [r+1];
            i++;
            r++;
        }
        for (int f = (shrinkarray.length- (b-a+1)); f <shrinkarray.length ; f++)
        {
            shrinkarray [f]=0;
        }
        for (int y: shrinkarray)         //поле необязательно, используется для проверки
        {
            System.out.print(y+"\t");
        }
        return shrinkarray;
    }

    //Найти сумму всех цифр целочисленного массива. Например, если дан массив [12, 104, 81],
    // то сумма всех его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17.

    public static int sumNum (int[] array)
    {
        int i = 0;
        int z = 0;
        while (i < array.length)
        {
            while (array[i] != 0)
            {
                int x = array[i] % 10;
                array[i] /= 10;
                z += x;
            }
            i++;
        }
        return z;
    }

    public static void main(String[] args)
    {
        int[] container = arrayRandom(10,10);
        printArray(container);
//        sum (container);
//        max(container);
//        maxAr(container);

//        int [] minTwo=minTwo(container);
//        System.out.println("Два наименьших значения в массиве: "+minTwo[0]+"\t"+ minTwo[1]);

//        shrink(container, 2, 4);
//        int z =sumNum(container);
//        System.out.println("Сумма чисел массива равна: " + z);
    }
}
