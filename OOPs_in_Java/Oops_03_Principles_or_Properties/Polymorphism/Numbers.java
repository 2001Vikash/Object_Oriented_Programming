package com.Kunal.Oops_03_Principles_or_Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }
    // this is method overloading. Method name is same but argument is different.
    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();// which method is run determination to know at the time of compile time
        // Compile time polymorphism.
        System.out.println(obj.sum(2,3) + " "+ obj.sum(2,3,5));
    }
}
