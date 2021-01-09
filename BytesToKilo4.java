package Lesson3;

import java.util.Scanner;

public class BytesToKilo4 {

    public static void main(String[] args) {
        boolean a;
        int b;

        Scanner scan =new Scanner(System.in);
        System.out.println("Если хотите перевести байты в килобайты - введите `true`, в обратном случае - `false`");
        a = scan.nextBoolean();
        System.out.println("Введите число, которое хотите перевести");
        b = scan.nextInt();

        if (a == true)
        {
            int c = b / 1024;
            System.out.println("заданное число байт равно " +c +" килобайт");
        }
        else
        {
            int c = b * 1024;
            System.out.println("заданное число килобайт равно " +c +" байт");

        }


    }

}
