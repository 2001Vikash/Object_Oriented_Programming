package com.Kunal.Oops_03_Principles_or_Properties.Polymorphism;

public class Shapes {
   void area(){ // If we write here final then we are not able to use more methods with same name that is known as overriding

        System.out.println("I am in Shapes");
    }
    //  for Early Bindings : check notes
}
// final keyword also can be used to avoid Inheritance
// whenever we make a class as final then it means that all methods of that class will be also final
// static method does not depend on class means if static method is inherited not override but when we use it will call static method which is in parent class
// Overriding depends on object but static does not depend on object hence we can't override static method
// polymorphism does not apply to instance variable