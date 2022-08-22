package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,3,9);
        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }
        System.out.println(sum);
        System.out.println();

        int result = numbers.stream().reduce(0, (a, b)-> a+b);
        System.out.println(result);

       Optional<Integer> totalCalories = DishData.getAll().stream().map(Dish::getCalories)
//                .reduce((a,b) -> a + b).get();
        .reduce(Integer::sum);
        System.out.println(totalCalories);//Optional[4200]
//        Or
        System.out.println(totalCalories.get());//4200
        System.out.println();

        int totalCalories2 = DishData.getAll().stream().map(Dish::getCalories)
//                .reduce((a,b) -> a + b).get();
                .reduce(Integer::sum).get();//using get method will return as int
        System.out.println(totalCalories2);
        System.out.println();

        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        int min = numbers.stream().reduce(Integer::min).get();//used get() it returned int

        System.out.println("sum2 = " + sum2.get());
        System.out.println("max = " + max.get());
        System.out.println("min = " + min);

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println("dishCount = " + dishCount);
    }
}
