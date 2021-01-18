package Arrays;

//4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//		4.3.1. {1,2,3,4,5,6}
//		4.3.2. {1,1,1,1}
//		4.3.3. {9,1,5,99,9,9}
//		4.3.4. {}

//4.4. После тестов написать код который будет создавать массив рандомной длинны, заполнять массив рандомными числами. Отсортировать.


import java.util.Random;

public class Arrays42 extends Arrays4
{
    public static void main(String[] args)
    {
        int [] a = new int[] {1,2,3,4,5,6};
        int [] b=new int[] {1,1,1,1};
        int [] c = new int[] {9,1,5,99,9,9};
        int [] d = new int[] {};

//        printArray(c);
//        int [] z = Bubble(c);
//        printArray(z);

        Random random = new Random();
//        int x = random.nextInt(2147483647); случайно значение в диапазоне int, на практике столкнулся с переполнением памяти,
//        и абсолютной нечитаемости выводимого значения, поэтмоу введу дипазон
        int x = (random.nextInt(21)+1);
        int y = random.nextInt(2147483647);
        int [] t=arrayRandom(x,y);//диапазон значений - 0,5 int в обе стороны
        printArray(t);
        int [] n = Bubble(t);
        printArray(n);
        int [] v = shake(t);
        printArray(t);

        int [] q =arrayFromConsole();
        printArray(q);




    }
}
