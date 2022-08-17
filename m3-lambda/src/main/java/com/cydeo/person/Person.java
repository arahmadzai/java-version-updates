package com.cydeo.person;

import lombok.*;



@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String Name;
    private int age;
    private Gender gender;

}
