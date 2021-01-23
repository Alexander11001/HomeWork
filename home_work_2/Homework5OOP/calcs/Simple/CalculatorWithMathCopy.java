package Homework5OOP.calcs.Simple;

import Homework5OOP.calcs.additional2.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double addition (double a, double b){
        double c= a+b;
        return c;
    }

    public double subtraction (double a, double b){
        double c= a-b;
        return c;
    }

    public double multiplication (double a, double b){
        double c= a*b;
        return c;
    }

    public double division (double a, double b){
        if (b==0){
            System.out.println("Вы пытались разделить на ноль");
            System.exit(0);
        }
        double c= a/b;
        return c;
    }

    public double sqrt (double a){
        return Math.sqrt(a);

    }

    public double absolutevalue (double a){
        return Math.abs(a);
    }

    public double exponentiation (double a, double b){
        return Math.pow(a,b);
    }

}




