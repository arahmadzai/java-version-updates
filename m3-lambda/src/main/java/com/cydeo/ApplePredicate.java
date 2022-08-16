package com.cydeo;

@FunctionalInterface//to check if it's functional interface
public interface ApplePredicate {
    boolean test(Apple apple);
}
