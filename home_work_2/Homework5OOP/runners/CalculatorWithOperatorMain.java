package Homework5OOP.runners;
//4.1 + 15 * 7 + (28 / 5) ^ 2

import Homework5OOP.calcs.Simple.CalculatorWithOperator;

//	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
//	В main методе требуется создать экземпляр калькулятора и используя методы из данного
//	экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator Calc1 = new CalculatorWithOperator();
        double a = Calc1.addition(Calc1.addition(4.1, (Calc1.multiplication(15.0, 7.0))),
                Calc1.exponentiation(Calc1.division(28.0,5.0), 2));
        System.out.println(a);
    }



}
