package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6);
        //list.forEach(integer -> System.out.println(integer));
        list.forEach(System.out::print);
        System.out.println();

        System.out.println("Filter");

        list.stream()
                .filter(i -> i%2==0)
                //.forEach(System.out::print);
                  .forEach(i -> System.out.print(i+" "));
        System.out.println();

        System.out.println("Distinct");

        list.stream()
                .filter(i-> i %2==0)
                .distinct()//avoid duplicates and provide only one copy
                .forEach(System.out::println);

        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(2)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Map");
        list.stream()
                .map(number -> number*2)
                .filter(i -> i%3==0)
                .forEach(System.out::println);





    }
}
