package com.Kunal.Oops_03_Principles_or_Properties.Inheritance;

public class Box {
    double l;// if we make l as private then we can't able to access from anywhere
    // private things only we can use in that file where it made.
    double h;
    double w;
    // we can use multiple constructors according to their use
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    // if we want to make a cube

    Box(double side){
        //super(); Object class
       this.l = side;
       this.h = side;
       this.w = side;
    }
    // with three argument
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    // constructor with another constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
