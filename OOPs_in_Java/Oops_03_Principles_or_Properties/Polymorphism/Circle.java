package com.Kunal.Oops_03_Principles_or_Properties.Polymorphism;

public class Circle extends Shapes{
    @Override // this is called as annotation.which is use for check purpose that any method is override or not.
    void area(){
        System.out.println("Area is pi*r*r");
    }
}
