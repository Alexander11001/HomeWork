package Homework5OOP.calcs.additional;

import Homework5OOP.calcs.Simple.CalculatorWithMathCopy;
import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;
import Homework5OOP.calcs.Simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    long using;

    public long getCountOperation(){
        return using;
    }

    public CalculatorWithOperator CalculatorWithOperator;
    public CalculatorWithMathCopy CalculatorWithMathCopy;
    public CalculatorWithMathExtends CalculatorWithMathExtends;



    public CalculatorWithCounterAutoComposite(CalculatorWithOperator Cal1)
    {this.CalculatorWithOperator = Cal1;    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy Cal1)
    {this.CalculatorWithMathCopy = Cal1;}

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends Cal1)
    {this.CalculatorWithMathExtends = Cal1;}


    public double addition (double a, double b){
        using ++;
        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.addition(a,b);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.addition(a,b);}
        else
        return CalculatorWithMathExtends.addition(a,b);
    }

    public double subtraction (double a, double b){
        using ++;
        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.subtraction(a,b);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.subtraction(a,b);}
        else
        return CalculatorWithMathExtends.subtraction(a,b);
    }

    public double multiplication (double a, double b){
        using ++;
        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.multiplication(a,b);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.multiplication(a,b);}
        else

        return CalculatorWithMathExtends.multiplication(a,b);
    }

    public double division (double a, double b){
        using ++;
        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.division(a,b);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.division(a,b);}
        else

        return CalculatorWithMathExtends.division(a,b);
    }

    public double sqrt (double a){
        using ++;

        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.sqrt(a);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.sqrt(a);}
        else
        return CalculatorWithMathExtends.sqrt(a);
    }

    public double absolutevalue (double a){
        using ++;

        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.absolutevalue(a);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.absolutevalue(a);}
        else

        return CalculatorWithMathExtends.absolutevalue(a);
    }

    public double exponentiation (double a, double b){
        using ++;
        if (CalculatorWithOperator!=null){
            return CalculatorWithOperator.exponentiation(a,b);}
        else if (CalculatorWithMathCopy!=null )
        {return CalculatorWithMathCopy.exponentiation(a,b);}
        else

        return CalculatorWithMathExtends.exponentiation(a,b);

    }

}











