package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> predicate = p -> p % 2 == 0 ? true : false;

        Calculate sum1 = (x,y) -> System.out.println(x+y);
        sum1.calculate(10, 12);

        Calculate sum2 = (x,y) -> Calculator.findSum(x,y);
        sum2.calculate(12, 20);

        //If lambda expression is calling a method it can be referenced that will make our codes elegant
        //Reference to a static method through the class name
        Calculate sum3 = Calculator::findSum;
        sum3.calculate(20, 30);

        //Reference to an instance method
        Calculator obj = new Calculator();
        Calculate multiply1 = obj::findMultiply;
        Calculate multiply2 = new Calculator()::findMultiply;
        multiply1.calculate(2, 5);

        BiFunction<String, Integer, String> biFunction1 = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> biFunction2 = String::substring;
        String result = biFunction2.apply("Java ", 1);
        System.out.println(result);

        Function<Integer, Double> function1 = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> function2 = MyClass::method;
        Double result2 = function2.apply(new MyClass(), 5);
        System.out.println(result2);








    }


}
