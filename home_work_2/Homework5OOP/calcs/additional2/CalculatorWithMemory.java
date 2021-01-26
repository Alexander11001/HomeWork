package Homework5OOP.calcs.additional2;

public class CalculatorWithMemory {


    long using;

    public long getCountOperation(){
        return using;
    }

    double memory;

    double memory2;


    public double returnMemory (){
     memory2=memory;
     memory=0;
     return memory2;
    }



    public double getMemory(){
        return memory;
    }


    public ICalculator ICalculator;

    public CalculatorWithMemory (ICalculator IC)
    {
        this.ICalculator=IC;
    }


    public double addition (double a, double b){
        using ++;
        memory=ICalculator.addition(a,b);

        return ICalculator.addition(a,b);
    }

    public double subtraction (double a, double b){
        using ++;
        memory=ICalculator.subtraction(a,b);

        return ICalculator.subtraction(a,b);
    }

    public double multiplication (double a, double b){


        using ++;
        memory=ICalculator.multiplication(a,b);

        return ICalculator.multiplication(a,b);
    }

    public double division (double a, double b){
        using ++;
        memory=ICalculator.division(a,b);

        return ICalculator.division(a,b);
    }

    public double sqrt (double a){
        using ++;
        memory=ICalculator.sqrt(a);
        return ICalculator.sqrt(a);
    }

    public double absolutevalue (double a){
        using ++;
        memory=ICalculator.absolutevalue(a);
        return ICalculator.absolutevalue(a);
    }

    public double exponentiation (double a, double b){
        using ++;
        memory=ICalculator.exponentiation(a,b);
        return ICalculator.exponentiation(a,b);

    }








}
