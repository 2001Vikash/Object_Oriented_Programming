package com.Kunal.Oops_02.staticExample;

// This is a demo to show initialisation of static variables.

public class staticBlocks {
    static int a = 4;
    static int b;

    // static block to initialize b
// will only run once when the first obj is created i.e. when class is loaded for the first time
    static {
        System.out.println("I am in Static Block");
        b = a*5;
    }

    public static void main(String[] args) {
        staticBlocks obj = new staticBlocks();
       // System.out.println(obj.a+" "+ obj.b);
        System.out.println(staticBlocks.a + " " + staticBlocks.b);// we can use it as well for convention
    }
}
