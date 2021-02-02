package Homework5OOP.runners;

import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;
import Homework5OOP.calcs.additional2.CalculatorWithCounterAutoDecorator;
import Homework5OOP.calcs.additional2.CalculatorWithMemoryDecorator;
import Homework5OOP.calcs.additional2.ICalculator;

class Cal1 extends CalculatorWithMemoryDecorator {
    public Cal1(ICalculator calculator) {
        super(calculator);
    }
}

class Cal3 extends CalculatorWithCounterAutoDecorator {
    public Cal3(ICalculator calculator) {
        super(calculator);
    }
}

class Cal4 extends CalculatorWithMathExtends implements ICalculator {}


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
        //CWCAS1.multiplication (12.6,2.0);  тестовые блоки, для проверки работоспособности
        //System.out.println(CWCAS1.returnMemory());
        //System.out.println(CWCAS1.returnMemory());

    }
}
