package Homework5OOP.calcs.Simple;

import Homework5OOP.calcs.additional2.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double exponentiation (double a, int b){
        return Math.pow(a,b);
    }

    @Override
    public double absolutevalue (double a){
        return Math.abs(a);
    }

    @Override
    public double sqrt (double a){
        return Math.sqrt(a);
    }


}
