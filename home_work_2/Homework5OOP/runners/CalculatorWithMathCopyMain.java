package Homework5OOP.runners;

import Homework5OOP.calcs.Simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy Calk2Math = new CalculatorWithMathCopy();
        double a= Calk2Math.addition(Calk2Math.addition(4.1, (Calk2Math.multiplication(15.0, 7.0))),
                Calk2Math.exponentiation(Calk2Math.division(28.0,5.0), 2));
        System.out.println(a);


    }
}
