package com.Kunal.Oops_05.InterFaces.nestedInterfaces;

public class A {
    // nested Interfaces

    public interface NestedInterface {
        boolean isOdd(int num);
    }
}
    class B implements A.NestedInterface{

        @Override
        public boolean isOdd(int num) {
            return (num & 1) == 1;
        }
    }

