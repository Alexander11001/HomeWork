package Homework5OOP.runners;

import Homework5OOP.calcs.additional2.CalculatorWithCounterAutoInterface;
import Homework5OOP.calcs.additional2.CalculatorWithMemory;
import Homework5OOP.calcs.additional2.ICalculator;

class Cal2 implements ICalculator {}

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        Cal2 Cal2 = new Cal2();
        CalculatorWithMemory CWCAS = new CalculatorWithMemory(Cal2);
        double a = CWCAS.addition(CWCAS.addition(4.1, (CWCAS.multiplication(15.0, 7.0))),
                CWCAS.exponentiation(CWCAS.division(28.0, 5.0), 2));
        System.out.println(a);
        System.out.println(CWCAS.getCountOperation());
        System.out.println(CWCAS.returnMemory());
        //CWCAS.multiplication (12.6,2.0); тестовые блоки
        //System.out.println(CWCAS.returnMemory());
        //System.out.println(CWCAS.returnMemory());


    }
}