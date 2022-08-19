package com.cydeo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car {

    private String make;
    private int model;

    public Car(int model){
        this.model = model;
    }

}
