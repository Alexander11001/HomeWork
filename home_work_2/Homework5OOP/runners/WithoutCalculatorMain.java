package Homework5OOP.runners;
//4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
// Внимание, знак "^" обозначает возведение в степень.
public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result = 4.1+15*7+(double) 28/5*(double) 28/5;
        System.out.println(result);
    }
}
