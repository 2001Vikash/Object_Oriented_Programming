package com.Kunal.Oops_04.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Vikash");

        // Here if we want to access private things (data hiding)  then we can not because
        // private things are secured we can access those things on that class where it made.
        // if we want to access then we need to make public method on that class to access
        // like as get or set type .

//        obj.num // we can't access

        // we access using this method

        obj.getNum();
        obj.setNum(3);
    }
}
