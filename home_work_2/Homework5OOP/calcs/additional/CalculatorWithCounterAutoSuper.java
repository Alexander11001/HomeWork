package Homework5OOP.calcs.additional;

import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long using;


    public long getCountOperation(){
        return using;
    }

    @Override
    public double exponentiation (double a, int b){
        using++;
        return super.exponentiation(a,b);
    }

    @Override
    public double absolutevalue (double a){
        using++;
        return super.absolutevalue(a);
    }

    @Override
    public double sqrt (double a){
        using++;
        return super.sqrt (a);
    }

    @Override
    public double addition (double a, double b){
        using++;
        return super.addition (a,b);
    }

    @Override
    public double subtraction (double a, double b){
        using++;
        return super.subtraction(a,b);
    }

    @Override
    public double multiplication (double a, double b){
        using++;
        return super.multiplication(a,b);
    }

    @Override
    public double division (double a, double b){
        using++;
        return super.division(a,b);
    }

}
