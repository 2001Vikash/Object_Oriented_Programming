package com.Kunal.Oops_03_Principles_or_Properties.Polymorphism;

public class definition {

    /*
    Polymorphism ==> Ploy -> means many and Morphism -> means ways to represent
                     means many ways to represent a single entity or item.
                     this is greek work
                     It occur during Inheritance

   Types of Polymorphism ->

     1 -> Compile time or Static Polymorphism -> achieved by method overloading

         Method Overloading -> When  class have the multiple methods with same name but
                               types, arguments, return types, ordering can be different
                               for ex. multiple constructors.


     2 -> Runtime/Dynamic Polymorphism -> achieved method overriding means parent class has a method and child class has a method means both are same but only body is different
                                          for example Shapes and Square classes in area method
                                          because Shapes is parent class has void area and Square has also same class this is known as @Override

                  Parent obj = new child();
                  parent defines which can access and object means child defines that which one will run
              here, which method will be called depends on child class.
                  this is known as UPCASTING
                  and all these things are defining that How overriding works.

         but java determine that child will run then the answer is Dynamic method Dispatch. that's why
         this type is known as Dynamic Polymorphism. it works at runTime java will determine that which one will run.
     */
}
