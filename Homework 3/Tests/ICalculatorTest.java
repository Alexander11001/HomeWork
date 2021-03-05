package Homework5OOP;

import Homework5OOP.calcs.Simple.CalculatorWithMathCopy;
import Homework5OOP.calcs.Simple.CalculatorWithMathExtends;
import Homework5OOP.calcs.Simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ICalculatorTest {
    CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

    @Test
    void addition() {
        assertEquals(calculatorWithMathCopy.addition(468, 12), 480);
        assertEquals(calculatorWithMathExtends.addition(468, 12), 480);
        assertEquals(calculatorWithOperator.addition(468, 12), 480);
    }

    @Test
    void subtraction() {
        assertEquals(calculatorWithMathCopy.subtraction(289, 64), 225);
        assertEquals(calculatorWithMathExtends.subtraction(289, 64), 225);
        assertEquals(calculatorWithOperator.subtraction(289, 64), 225);
    }

    @Test
    void multiplication() {
        assertEquals(calculatorWithMathCopy.multiplication(1286, 59), 75874);
        assertEquals(calculatorWithMathExtends.multiplication(1286, 59), 75874);
        assertEquals(calculatorWithOperator.multiplication(1286, 59), 75874);

    }

    @Test
    void division() {
        assertEquals(calculatorWithMathCopy.division(9.999, 3.333), 3);
        assertEquals(calculatorWithMathExtends.division(9.999, 3.333), 3);
        assertEquals(calculatorWithOperator.division(9.999, 3.333), 3);
    }

    @Test
    void sqrt() {
        assertEquals(calculatorWithMathCopy.sqrt(65536), 256);
        assertEquals(calculatorWithMathExtends.sqrt(65536), 256);
        assertEquals(calculatorWithOperator.sqrt(65536), 256);
    }

    @Test
    void absolutevalue() {
        assertEquals(calculatorWithMathCopy.absolutevalue(-65536), 65536);
        assertEquals(calculatorWithMathExtends.absolutevalue(-65536), 65536);
        assertEquals(calculatorWithOperator.absolutevalue(-65536), 65536);

    }

    @Test
    void exponentiation() {
        assertEquals(calculatorWithMathCopy.exponentiation(12.84, 1.6), 59.38872996978127);
        assertEquals(calculatorWithMathExtends.exponentiation(12.84, 1.6), 59.38872996978127);
        assertEquals(calculatorWithOperator.exponentiation(12.84, 1.6), 59.38872996978127);
    }


    @Test
    void CalculatorWithMathCopyTest() {
        assertEquals(calculatorWithMathCopy.addition(calculatorWithMathCopy.addition(4.1,
                (calculatorWithMathCopy.multiplication(15.0, 7.0))),
                calculatorWithMathCopy.exponentiation(calculatorWithMathCopy.division(28.0, 5.0), 2)),
                140.45999999999998);
    }

    @Test
    void CalculatorWithMathExtendsTest() {
        assertEquals(calculatorWithMathExtends.addition(calculatorWithMathExtends.addition(4.1,
                (calculatorWithMathExtends.multiplication(15.0, 7.0))),
                calculatorWithMathExtends.exponentiation(calculatorWithMathExtends.division(28.0, 5.0), 2)),
                140.45999999999998);
    }

    @Test
    void CalculatorWithOperator() {
        assertEquals(calculatorWithOperator.addition(calculatorWithOperator.addition(4.1,
                (calculatorWithOperator.multiplication(15.0, 7.0))),
                calculatorWithOperator.exponentiation(calculatorWithOperator.division(28.0, 5.0), 2)),
                140.45999999999998);
    }


}
