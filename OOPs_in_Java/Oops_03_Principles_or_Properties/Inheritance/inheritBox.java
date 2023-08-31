package com.Kunal.Oops_03_Principles_or_Properties.Inheritance;
// Inheritance
public class inheritBox extends Box{
    // here extend is keyword which is make this class able to use Box's properties.
    double weight; // additional properties with Box properties

    inheritBox(){
        this.weight = -2;
    }
//    Box box = new inheritBox(2,3,4,5);
//        System.out.println(box.l);
    // exactly the same thing
    inheritBox(inheritBox other){
        super(other);
        weight = other.weight;
    }
    inheritBox(double side, double weight){
        super(side);
        this.weight = weight;
    }

    inheritBox(double l, double h, double w, double weight){
        super(l,h,w);// what is this? call the parent class constructor
        // used to initialize values present in parent class.
        // here super have not knowledge about child class
        this.weight = weight;
    }
}
