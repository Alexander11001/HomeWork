package Homework5OOP.runners;

import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;
import Homework5OOP.calcs.additional2.CalculatorWithCounterAutoDecorator;
import Homework5OOP.calcs.additional2.CalculatorWithMemoryDecorator;
import Homework5OOP.calcs.additional2.ICalculator;


public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc9 = new CalculatorWithMathExtends();
        CalculatorWithMemoryDecorator CWCAS1 = new CalculatorWithMemoryDecorator (calc9);
      ICalculator CWCAS = new CalculatorWithCounterAutoDecorator(CWCAS1);
        double a = CWCAS.addition(CWCAS.addition(4.1, (CWCAS.multiplication(15.0, 7.0))),
                CWCAS.exponentiation(CWCAS.division(28.0, 5.0), 2));
        System.out.println(a);
        System.out.println(CWCAS1.getCountOperation());
        System.out.println(CWCAS1.returnMemory());
        //CWCAS1.multiplication (12.6,2.0); // тестовые блоки, для проверки работоспособности
        //System.out.println(CWCAS1.returnMemory());
       // System.out.println(CWCAS1.returnMemory());

    }
}
