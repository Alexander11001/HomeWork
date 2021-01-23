package Homework5OOP.runners;

import Homework5OOP.calcs.Simple.CalculatorWithMathCopy;
import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;
import Homework5OOP.calcs.Simple.CalculatorWithOperator;
import Homework5OOP.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy Cal1 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoComposite CWCAS = new CalculatorWithCounterAutoComposite(Cal1);
        double a= CWCAS.addition(CWCAS.addition(4.1, (CWCAS.multiplication(15.0, 7.0))),
                CWCAS.exponentiation(CWCAS.division(28.0,5.0), 2));
        System.out.println(a);
        System.out.println(CWCAS.getCountOperation());
    }
}
