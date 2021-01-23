package Homework5OOP.runners;

import Homework5OOP.calcs.Simple.CalculatorWithMathCopy;
import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends Calk2MathExtends = new CalculatorWithMathExtends();
        double a= Calk2MathExtends.addition(Calk2MathExtends.addition(4.1, (Calk2MathExtends.multiplication(15.0, 7.0))),
                Calk2MathExtends.exponentiation(Calk2MathExtends.division(28.0,5.0), 2));
        System.out.println(a);
    }
}
