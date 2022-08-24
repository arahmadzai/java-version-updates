package com.cydeo.java11;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethodDemo {

    public static void main(String[] args) {

//      lines() method returns a stream of lines extracted from the string, separated by line terminators such as \r, \n.
        var str1 = "Hello I'm Abidullah Rahimi.\nI am a student at Cydeo.\rI live in Sacramento, CA.";
        long lineCount = str1.lines().count();
        System.out.println("No of lines: " + lineCount);
        List<String> lines = str1.lines().collect(Collectors.toList());
        System.out.println(lines);

        var str2 = "Mike \n Ozzy \n Tom \n Emmy";

        str2.lines().forEach(System.out::println);

        System.out.println("-------------------------- repeat()-----------------------------");

//        repeat(int count) method repeats the string ‘n’ times (concatenate the string) and returns a string composed 
//        of this string repeated ‘n’ times. It will throw IllegalArgumentException if the count is negative.

        String str3 = "Afghanistan\n";
        String result3 = str3.repeat(5);
        System.out.println(result3);

        System.out.println("-------------------------- isBlank()-----------------------------");
        var str4 = "";
        System.out.println(str4.isBlank());

        var str5 = "    ";
        System.out.println(str5.isBlank());

        var str6 = "  Abid  ";
        System.out.println(str6.isBlank());

        System.out.println("-------------------------- strip()-----------------------------");

//      The strip() method removes all the leading and trailing white space and return a new composed string.
        var str7 = "\t    Alex    \u2005";
        System.out.println(str7.strip());

        System.out.println("------------------------stripLeading()--------------------------");

//      stringLeading() method returns a string whose value is string, with all leading white space removed.
        var str8 = "\t    Abid    \u2005";
        System.out.println(str8.stripLeading());

        System.out.println("------------------------stripTrailing()---------------------------");

//      Returns a string whose value is string, with all trailing white space removed.
        var str9 = "\t    Abid    \u2005";
        System.out.println(str9.stripTrailing());




    }
}