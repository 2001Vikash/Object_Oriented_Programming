package com.Kunal.Oops_02.singleton;

public class Main {
    public static void main(String[] args) {
        // only one time object will create then after whatever we make all place object will same
        // but different - 2 reference variable will being pointing to it.
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

         // All three reference variables are pointing to just one object.
        // means we can't create new object in this case.
    }
}
