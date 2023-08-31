package com.Kunal.Oops_03_Principles_or_Properties.Polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num;
    }
    // we can also use 'final' keyword to prevent overriding
    @Override
    public String toString(){
        return "Hello Vikash this toString method";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(45);
        System.out.println(obj);
    }
}
