package com.Kunal.Oops_02.staticExample;

public class InnerClasses {
   static class Test {
        // outside classes will never static because it is not itself dependent on any other class.
       // innerClasses can be static and non-static.
       // but Test -> innerClass is dependent on outside class -> InnerClass

       String name;
       public Test(String name){
           this.name = name;
       }
    }

    public static void main(String[] args) {
        Test a = new Test("Vikku");


        System.out.println();// '.' is actually binds the instance method to reference method.

        // println -> method
        // out -> variable
        // System -> class.
    }
}
// static things are resolved during compile time.