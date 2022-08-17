package com.cydeo.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Abid", "Rahimi", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pollard", 35));

        //print all each user from userList
        users.forEach( user -> System.out.println(user)); //1st way of printing all the users
        System.out.println("---------------------------------------");
        printName(users, user -> true);//2nd way of printing all the users

        System.out.println("----------------------------------------");

        //Print all the people whose last first name starts with A
        Predicate<User> userPredicate = p -> p.getFirstName().startsWith("A");
        printName(users, userPredicate);







    }
    private static void printName(List<User> userList, Predicate<User> p){
        for (User user : userList){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
