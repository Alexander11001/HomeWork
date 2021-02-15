package Homework5OOP.runners;

import Homework5OOP.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper CWCAS = new CalculatorWithCounterAutoSuper();
        double a= CWCAS.addition(CWCAS.addition(4.1, (CWCAS.multiplication(15.0, 7.0))),
                CWCAS.exponentiation(CWCAS.division(28.0,5.0), 2));
        System.out.println(a);
        System.out.println(CWCAS.getCountOperation());
    }
}
