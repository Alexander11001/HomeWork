package Homework5OOP.calcs.additional2;

import Homework5OOP.Exceptions.DivideByZero;

public interface ICalculator {
   default double addition(double a, double b){
        double c= a+b;
        return c;
    }

    default double subtraction(double a, double b){
        double c= a-b;
        return c;
    }

    default double multiplication (double a, double b){
        double c= a*b;
        return c;
    }

    default double division (double a, double b){
        if (b==0) {
            throw new DivideByZero();
        }
        double c= a/b;
        return c;
    }

    default double sqrt (double a){
        return Math.sqrt(a);

    }

    default double absolutevalue (double a){
        return Math.abs(a);
    }

    default double exponentiation (double a, double b){
        return Math.pow(a,b);
    }

}

