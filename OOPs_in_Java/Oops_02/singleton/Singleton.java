package com.Kunal.Oops_02.singleton;

public class Singleton {
    // If we want to make only one class then we need to stop making new objects
    // and we know that when new object will create then it will call constructor
    // means we need to stop the use of constructor for every object that's why we make it private
    // means whatever private those things only run in that class where it is specified

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
