package com.cydeo.tasks;

public class EvenPredicate implements UnaryPredicate<Integer>{

    @Override
    public boolean test(Integer obj) {
        return obj %2 == 0;
    }
}
