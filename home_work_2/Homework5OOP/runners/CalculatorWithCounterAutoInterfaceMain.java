package Homework5OOP.runners;


import Homework5OOP.calcs.additional2.CalculatorWithCounterAutoInterface;
import Homework5OOP.calcs.additional2.ICalculator;


class Cal implements ICalculator{}

public class CalculatorWithCounterAutoInterfaceMain {


    public static void main(String[] args) {
        Cal Cal1 = new Cal();
        CalculatorWithCounterAutoInterface CWCAS = new CalculatorWithCounterAutoInterface(Cal1);
        double a= CWCAS.addition(CWCAS.addition(4.1, (CWCAS.multiplication(15.0, 7.0))),
                CWCAS.exponentiation(CWCAS.division(28.0,5.0), 2));
        System.out.println(a);
        System.out.println(CWCAS.getCountOperation());
    }
}



