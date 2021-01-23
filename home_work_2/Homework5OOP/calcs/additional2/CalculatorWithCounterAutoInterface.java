package Homework5OOP.calcs.additional2;

public class CalculatorWithCounterAutoInterface {

    long using;



    public long getCountOperation(){
        return using;
    }

    public ICalculator ICalculator;


    public CalculatorWithCounterAutoInterface(ICalculator IC)
    {
        this.ICalculator=IC;
    }


    public double addition (double a, double b){
        using ++;

            return ICalculator.addition(a,b);
    }

    public double subtraction (double a, double b){
        using ++;

            return ICalculator.subtraction(a,b);
    }

    public double multiplication (double a, double b){
        using ++;


            return ICalculator.multiplication(a,b);
    }

    public double division (double a, double b){
        using ++;

            return ICalculator.division(a,b);
    }

    public double sqrt (double a){
        using ++;

            return ICalculator.sqrt(a);
    }

    public double absolutevalue (double a){
        using ++;

            return ICalculator.absolutevalue(a);
    }

    public double exponentiation (double a, double b){
        using ++;

            return ICalculator.exponentiation(a,b);

    }






}
