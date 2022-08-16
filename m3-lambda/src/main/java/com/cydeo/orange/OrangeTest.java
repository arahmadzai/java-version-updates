package com.cydeo.orange;

import com.cydeo.apple.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        displayOranges(inventory,orangeLambda);

        displayOranges(inventory,orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("**************************************");

        OrangeFormatter orangeFormatter = orange -> {
           String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
           return "A " + ch + " " + orange.getColor() + " orange";
        };

        displayOranges(inventory, orangeFormatter);
        displayOranges(inventory, orange -> {//here we passed the action directly
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + ch + " " + orange.getColor() + " orange";
        });



    }

    private static void displayOranges(List<Orange> orangeList, OrangeFormatter formatter){
        for (Orange orange : orangeList){
            String output = formatter.accept(orange);
            System.out.println(output);
            }
        }
    }

