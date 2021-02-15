package Homework5OOP.runners;

import Homework5OOP.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic CWithCounter = new CalculatorWithCounterClassic();
        System.out.println(CWithCounter.getCountOperation());
    }
}
