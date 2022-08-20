package com.cydeo.task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {


        //Print all dish's name that has less tan 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
         //     .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------");

        //Print the length of the name of each dish
        DishData.getAll().stream()
             //   .map(dish -> dish.getName().length())
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------");

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
             // .map(dish -> dish.getName())
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------");

        //Print all dish names that are below 400 calories in sorted order
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())//we used reverse for descending order
                .map(Dish::getName)
                .forEach(System.out::println);






    }
}
