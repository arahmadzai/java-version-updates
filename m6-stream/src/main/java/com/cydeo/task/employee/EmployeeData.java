package com.cydeo.task.employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Abdullah","abdullah@gmail.com", Arrays.asList("2022028765","7038763425")),
                new Employee(101,"Ahmad","Ahmad@hotmail.com", Arrays.asList("4122028765","8998763425")),
                new Employee(102,"Mohammad","Mohammad@yahoo.com", Arrays.asList("5162028765","6198763425"))
        );
    }
}
