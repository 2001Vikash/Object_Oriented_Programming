package com.Kunal.Oops_06.cloning;

import java.util.Vector;

public class Human implements Cloneable{// it is just for telling the JVM that we are using clone in the Object of type Human
    int age;
    String name;
    int[] arr;
    public Human(int age, String name){
        this.age =  age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
