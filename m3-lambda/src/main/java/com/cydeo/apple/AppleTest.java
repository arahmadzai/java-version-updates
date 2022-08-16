package com.cydeo.apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));
        System.out.println(inventory);
        System.out.println();

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);
        System.out.println();

       ApplePredicate weightApple = (Apple apple) -> apple.getWeight() > 200;
      List<Apple> weightBased = filterApples(inventory, weightApple);

        System.out.println(weightBased);

        List<Apple> colorBased = filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(colorBased);




    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
