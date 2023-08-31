package com.Kunal.Oops_03_Principles_or_Properties.Inheritance;
// it is showing multilevel Inheritance

public class BoxPrice extends inheritBox{
    double cost;
    BoxPrice(){
        super();
        this.cost = -3;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
    BoxPrice(double side, double weight,double cost){
        super(side, weight);
        this.cost = cost;
    }
    BoxPrice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }
}
