package com.cydeo;

import com.cydeo.java10.Apple;
import com.cydeo.java9.FactoryMethodsDemo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        System.out.println(Optional.of(numbers).isPresent());
        System.out.println(Optional.of(numbers).isEmpty());

//        System.out.println(empty.get());
        //IfPresent
        Optional<Integer> bigNumber = numbers.stream().filter(x -> x>100).findAny();
        bigNumber.ifPresent(System.out::println);

//get
//        System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse(5));

// dependency from m8 imported to m7
        FactoryMethodsDemo f1 = new FactoryMethodsDemo();

        Apple apple = new Apple();


    }
}
