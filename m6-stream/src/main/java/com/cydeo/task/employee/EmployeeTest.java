package com.cydeo.task.employee;

import com.cydeo.task.dish.Dish;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        System.out.println("Print all the emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all the phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all the phone numbers with double colon operator");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);




    }
}
