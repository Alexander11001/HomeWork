package Lesson2;

public class Operat2 {
    public static void main(String[] args) {
    int a = 2;
    int b = 8;

    // 5 + 2 / 8
    int c = 5+2/8; // 5, т.к. остаток от деления 2/8 =0
    System.out.println (c);

    //(5 + 2) / 8
    int d = (5+2)/8; // 0, т.к. остаток от деления 7(выполняется первым) на 8 = 0
    System.out.println(d);

    // (5 + 2++) / 8
    int e = (5+a++)/8; //0 т.к. ++ выполнится после сложения, будь ++a, было бы 1
    System.out.println(e);
        a = 2;

    //(5 + 2++) / --8
    int f = (5+a++)/--b; //1, т.к. 7 делится на 7 (перед операцией отнимаем 1 от восьми)
        System.out.println(f);
        a = 2;
        b = 8;


    //(5 * 2 >> 2++) / --8
    int g = (5*2 >> a++)/--b; //0 первое выражение равно двум, т.к. 10 в двоичном виде (1010) при сдвиге на 2,
        // дает 2 (0010), от деления на 7 получается 0
    System.out.println(g);
        a = 2;
        b = 8;

    //(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
    int h = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b; //12<20, т.е. false, соответвенно переходим к сдивгу битов 44 на 2,
        // т.е из 0010 1100 в 1011 т.е. в 11/7 = 1
        System.out.println(h);
        a = 2;
        b = 8;

    //(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
    //int i =(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b;  Ошибка компиляции. Вместе намешаны арифметические и
    //логические операторы (>=)

    //6 - 2 > 3 && 12 * 12 <= 119
    boolean i = 6 - 2 > 3 && 12 * 12 <= 119; //4>3 = true и 144 не <= 119 т.е. false, соответсвенно ответ - false
    System.out.println(i);

    //true && false
    boolean j = true && false; //увы, не Брат 2, true и false дают false
    System.out.println(j);
    }

}