package Homework5OOP.calcs.additional2;

public class CalculatorWithCounterAutoDecorator implements ICalculator{
    public ICalculator calculator;
    long using;

    public long getCountOperation(){
        return using;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    ICalculator getCalculator()
    {
    return calculator;
    }

    @Override
    public double addition(double a, double b) {
        using++;
        return this.calculator.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        using++;
        return this.calculator.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        using++;
        return this.calculator.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        using++;
        return this.calculator.division(a, b);
    }

    @Override
    public double sqrt(double a) {
        using++;
        return this.calculator.sqrt(a);
    }

    @Override
    public double absolutevalue(double a) {
        using++;
        return this.calculator.absolutevalue(a);
    }

    @Override
    public double exponentiation(double a, double b) {
        using++;
        return this.calculator.exponentiation(a, b);
    }
}
