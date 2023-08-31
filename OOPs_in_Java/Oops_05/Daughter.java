package com.Kunal.Oops_05;

public class Daughter extends Parent {
    @Override
    void career(String name) {
        System.out.println("I am going to be a "+ name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+" He is " +age);
    }
}