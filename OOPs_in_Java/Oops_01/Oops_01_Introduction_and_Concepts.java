package com.Kunal.Oops_01;

import java.util.Arrays;

public class Oops_01_Introduction_and_Concepts {
//    public static void main(String[] args) {
//        // class -> It is a named group of properties and functions. And also we can say that it starts with capital letters.
//
//        // A class is a template of Object and An object is an instance of that class
//        // A class is logical construct
//        // An Object is physical reality. (occupies space in memory)
//        // Variables stored in stack memory and Objects are stored in Heap memory
//        // Variables inside the class they are known as Instance variable
//        // we link both instance using dot(.) operator in java categories as separater.
//
//        Student[] s1 = new Student[5];
//        System.out.println(Arrays.toString(s1));
//
//        Student s ;// declaring and in stack memory not created an object till.
//        // compile time
//         s = new Student();// here we are creating an object and this 'new' operator it actually dynamically allots memory means allocates the emory at runTime. and return the a reference variable to it.
//        // runTime
//
//        // Student() is a constructor -> it defines what happens when your object will be created
//        s.name = "Vikash";
//        s.marks = 45.55f;
//        s.rollNumber = 72;
//
//        System.out.println(s.name);
//        System.out.println(s.check);// by  default false and default value we can also give in class as our choice.
//    }
//    public static class Student{
//        int rollNumber;
//        float marks ;
//        String name;
//        boolean check;
//    }


//    public static void main(String[] args) {
//        // using constructor
//
////        Student s1 = new Student();// special type of function inside class
////            // when we don't have any constructor inside class then it will work by default
////        Student s2 = new Student();// in constructor this will replace by s2 if we use it.
////
//////        System.out.println(s1.name);
//////        System.out.println(s1.rNo);
//////        System.out.println(s1.marks);
////
////        s1.changeName("Vikku");
////        s1.greeting();
//
//        Student s = new Student(72, "Vikash", 89.17f);
//         // int n = 10; here 10 is an object itself
//        System.out.println(s.name);
//        System.out.println(s.rNo);
//        System.out.println(s.marks);
//
//       Student random = new Student(s);
//        System.out.println(random.name);
//
//        Student random2 = new Student();
//        System.out.println(random2.name);
//    }
//    public static class Student{
//        int rNo ;
//        String name;
//        float marks;
//
//        void greeting(){
//            System.out.println("Hello my name is "+ name);// we can also write this.name
//        }
//
//        void changeName(String newName){
//            name = newName;
//        }
//
//        // constructor
//
//        // we need a way to add the values of the above
//        // properties object by object.
//
//        // we need one word to access every object
//        // and it will do by 'this' keyword.
////        Student(){
////           this.rNo = 72;
////           this.name = "Vikash";
////           this.marks = 89.6f;// all these are known as function/constructor overloading
////        }
//        Student(int rNo, String naam, float marks){
//            this.rNo = rNo ;// if reference variable name in constructor argument name as in class then we need to use this keyword if different then not require
//            // naam is different than name
//            name = naam;// we can use without this keyword or we can use as well
//            this.marks = marks;
//        }
//
//        Student (Student other){
//            this.name = other.name;
//            this.rNo = other.rNo;
//            this.marks = other.marks;
//        }
//
//        // this is how you call a constructor from another constructor
//        Student(){
//            this(12,"Gk", 100.0f);
//        }
//    }



    // Wrapper Examples

    public static void main(String[] args) {
//        int n = 10;
//        Integer num = 45; // or new Integer(45). // 45 is an object
//
//        int a = 10;
//        int b = 20;
//        swap(a,b);// it will not swap because these are primitive and in Java no such things pass by reference

//        System.out.println(a+" "+b);
         // Everything is pass by value. and in primitive pass by value means just value.
        // it is swapping inside the function only not changed in object

        // But when we passed object then the reference value is passed

        Integer a = 10;
        Integer b = 20;
        // so this is object a and b are reference variables
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a+" "+b); // but yaha to variable which is pointing to the object ko hi swap kr rhe hai to ho jayega
        // but when we pass primitive data types in function that time it will go only value not reference.

        // Because primitive variable's information is stored as the value of that variable, whereas a reference variable holds a reference to
          // information related to that variable.

        // Integer is final keyword

//        final int  bonus = 2;// always initialize while declaring. it will work on primitive data types for fixing values.
//        // we can't modify it is fixed due to final keyword that's why Integer not work in swapping because it is also final
//        bonus = 3;
// when a non-primitive is with final keyword , you can not reassign it. but we can change values but not object like that.
        swap2(a,b);
        System.out.println(a+" "+b);// means Integer is a final class.if there is any final keyword make sure it is in all capital letters.


        // garbage collections

//        A obj;
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A();
//        }
    }
    static void swap(int a, int b){
        Integer temp = a;
        a = b;
        b = temp;
       // System.out.println(a + " " +b);
    }
    static void swap2(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;

    }
}
// class A{
//    String name;
//
//    @Override
//     protected void finalize() throws Throwable {
//        System.out.println("Destroyed");
//    }
//}
// garbage collector will remove/destroyed automatically objects if more than one object pointing to the same variable
// because we know that no more than one object can point to same object.
// we can't use this manually we give some task to do at the time of deleting