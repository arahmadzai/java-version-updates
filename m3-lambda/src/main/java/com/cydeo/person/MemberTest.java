package com.cydeo.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MemberTest {

    public static void main(String[] args) {

        Person person1 = new Person("Abid", 36, Gender.MALE);
        Person person2 = new Person("Maryam", 24, Gender.FEMALE);
        Person person3 = new Person("Abraham", 36, Gender.MALE);
        Person person4 = new Person("Asya", 15, Gender.FEMALE);

        List<Person> list = new ArrayList<>(Arrays.asList(person1, person2, person3, person4));
        CheckMember member = person -> person.getAge() >= 18 && person.getAge() <= 25 && person.getGender()==(Gender.FEMALE);
        print(list, member);

        print(list, person -> person.getAge() >= 18 && person.getAge() <= 25 && person.getGender()==(Gender.FEMALE));

    }

    private static void print(List<Person> personList, CheckMember checkMember){

        List<Person> resultList = new ArrayList<>();
        for (Person person : personList){
            if (checkMember.test(person)){
                resultList.add(person);
            }
        }
        System.out.println(resultList);
    }
}
