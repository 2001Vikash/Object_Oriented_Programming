package com.Kunal.Oops_07.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(55);
        list2.add(89);

        System.out.println(list2);

        /*
        In ArrayList multiple thread can access the same object
        but in Vector on thread can access an Object at a time
        that's why Vector is Synchronized but not ArrayList.

        that's why ArrayList is Faster due to asynchronous
         */

        Vector<Integer> list3 = new Vector<>();
        list3.add(45);
        list3.add(43);// like that
        System.out.println(list3);

    }
}
