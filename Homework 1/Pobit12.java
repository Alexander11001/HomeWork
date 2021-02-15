package Lesson2;

public class Pobit12 {
    public static void main(String[] args) {
        int a = -42; //11010110
        int b = -15; //11110001

//	~Побитовый унарный оператор NOT
        int c = ~a; //41, 00101001

        int d = ~b; //14, 00001110

        // &	Побитовый AND
        int and = a & b; //-48, 11010000

        ////&=Поразрядная логическая операция И с присваиванием
        int and1 = a &= b; //-48, 11010000
        a = -42;
        // |	Побитовый OR
        int or = a | b; //-9, 11110111

        //|=Поразрядная логическая операция ИЛИ с присваиванием

        int ora = a |= b;//-9, 11110111
        a = -42;

        //^	Побитовый исключающее OR
        int ori = a ^ b; //39, 00100111

        //^=Поразрядная логическая операция исключающее ИЛИ с присваиванием
        int oria = a ^= b; //39, 00100111
        a = -42;

        //Сдвиг вправо
        int e = a >> b; //-1, 11111111
        int f = b >> a; //-1, 11111111

        //>>Сдвиг вправо с присваиванием
        int ri = a >>= b; //-1, 11111111
        a = -42;

        //>>> Сдвиг вправо с заполнением нулями
        int g = a >>> b; //32767, 0111111111111111
        int h = b >>> a; //1023, 001111111111


        //>>>=Сдвиг вправо с заполнением нулями и присваиванием
        int righ = a >>>= b;//32767, 0111111111111111
        a = -42;


        //	Сдвиг влево

        int i = a << b;  //-5505024, 11111111101011000000000000000000
        int j = b << a;  //-26914560 , 11111100010000000000000000000000

        // <<=Сдвиг влево с присваиванием
        int lef = a <<= b;  //-5505024, 11111111101011000000000000000000
        int left = b <<= a; //-15 , 11110001
        a=-42;
        b=-15;

        double r = 42.5;
        //double t = ~r; Побитовые операторы применяются только к типам long, int, short, char, byte.


    }
}
