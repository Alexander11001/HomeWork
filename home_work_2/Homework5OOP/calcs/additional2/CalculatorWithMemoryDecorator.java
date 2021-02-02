package Homework5OOP.calcs.additional2;

public class CalculatorWithMemoryDecorator implements ICalculator {
    public ICalculator calculator;
    long using;
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
    public long getCountOperation(){
        return using;
    }

    public CalculatorWithMemoryDecorator (ICalculator calculator) {
        this.calculator = calculator;
    }

    ICalculator getCalculator()
    {
        return calculator;
    }

    @Override
    public double addition(double a, double b) {
        using++;
        memory=this.calculator.addition(a, b);
        return this.calculator.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        using++;
        memory=this.calculator.subtraction(a, b);
        return this.calculator.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        using++;
        memory=this.calculator.multiplication(a, b);
        return this.calculator.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        using++;
        memory=this.calculator.division(a, b);
        return this.calculator.division(a, b);
    }

    @Override
    public double sqrt(double a) {
        using++;
        memory=this.calculator.sqrt(a);
        return this.calculator.sqrt(a);
    }

    @Override
    public double absolutevalue(double a) {
        using++;
        memory=this.calculator.absolutevalue(a);
        return this.calculator.absolutevalue(a);
    }

    @Override
    public double exponentiation(double a, double b) {
        using++;
        memory=this.calculator.exponentiation(a, b);
        return this.calculator.exponentiation(a, b);
    }
}





