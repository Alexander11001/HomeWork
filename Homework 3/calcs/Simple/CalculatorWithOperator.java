package Homework5OOP.calcs.Simple;

//	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	2.2 В классе должны присутствовать математические методы:
//		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
//		каждый из этих методов должен принимать два параметра (определитесь с их типами) и
//		должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
//		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	2.3 В методах можно использовать любые арифметические операторы.
//	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня).
//	Если у Вас плохо с математикой, то для реализации метода "Корень из числа" можно воспользоваться библиотекой Math.
//	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
//	В main методе требуется создать экземпляр калькулятора и используя методы из данного
//	экземпляра посчитать выражения из задания 1. Вывести в консоль результат.

import Homework5OOP.Exceptions.DivideByZero;
import Homework5OOP.calcs.additional2.ICalculator;

public class CalculatorWithOperator  implements ICalculator {

    public double addition (double a, double b){
        double c= a+b;
        return c;
    }

       public double subtraction (double a, double b){
        double c= a-b;
        return c;
    }

    public double multiplication (double a, double b){
        double c= a*b;
        return c;
    }

    public double division (double a, double b){
        if (b==0) {
            throw new DivideByZero();
        }
        double c= a/b;
        return c;
    }

    public double exponentiation (double a, int b){
        double z=a;
        if (a<0){
            throw new IllegalArgumentException("Неверный формат данных");
        }
        else if (b<0){
            throw new IllegalArgumentException("Неверный формат данных");
       }
        else {
            for (int i = 1; i <b ; i++) {
                a*=z;
            }
        }
        return a;
    }

    public double absolutevalue (double a){
       if(a>=0){
           return a;
       }
           else {
               return (a*-1);
       }
     }

    public double sqrt (double a){
        return Math.sqrt(a);

    }

}

