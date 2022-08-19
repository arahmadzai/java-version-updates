package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 23, 34, 7);
        System.out.println(list);
        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.reverse(list);
        System.out.println(list);

        //Descending order using comparator
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0));
        Collections.sort(list, new MyComparator()::compare);

        //Ascending order
        list.sort(((o1, o2) ->  o1.compareTo(o2)));
        System.out.println(list);

        //Descending order using comparator
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);


    }
}
