package com.Kunal.Oops_05;

public class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println("I am going to be an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+ name + " and She is "+ age);
    }
}
