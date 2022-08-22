package com.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                //.map(e -> e.length())
                .map(String::length)
                .forEach(System.out::println);




    }
}
