package Homework5OOP.calcs.additional;

import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long using =0;

    public void incrementCountOperation () {
        using++;
    }

    public long getCountOperation(){
        return using;
    }




}
