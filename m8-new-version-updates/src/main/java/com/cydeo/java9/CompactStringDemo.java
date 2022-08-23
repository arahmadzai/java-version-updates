package com.cydeo.java9;

public class CompactStringDemo {

    public static void main(String[] args) {

        //before java 9 all string objects were represented by UTF-16 means for each char there were 2 bytes of space
        //_J_A_V_A in Java 9 they compact the string they came up with Latin-1, 1Byte representing each character
        //"JAVA" 4 bytes representing 4 characters of

        String country = "Afghanistan";





    }
}
