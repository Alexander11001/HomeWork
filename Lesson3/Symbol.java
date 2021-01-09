package Lesson3;

//Вводится целое число, обозначающее код символа по таблице ASCII.
// Определить, это код английской буквы или какой-либо иной символ.
import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);
        System.out.println("Введите целое число, обозначающее код символа по таблице ASCII");
        int a=symbol.nextInt();

        if (a<0 | a>256)
        {
            System.out.println("Введенное значение не входит в диапазон данных таблицы ASCII");
        }
        else if ((a>=65 && a<=90) | (a>=97 && a<=122))
        {
            System.out.println("Введеное число - код английской буквы по таблице ASCII");
        }
        else
        {
            System.out.println("Введеное число - не является кодом английской буквы по таблице ASCII");
        }


    }
}
