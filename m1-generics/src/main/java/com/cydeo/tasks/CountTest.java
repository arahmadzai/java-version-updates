package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 5);
        int count = countIf(ci, new OddPredicate());
        int count2 = countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = "+ count);
        System.out.println("Number of even integers = "+ count2);



    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){

        int count = 0;
        for (T elem : c){
            if (p.test(elem)){
                ++count;
            }
        }
        return count;
    }


}
