package com.Kunal.Oops_04.Access;

public class A {

    private int num ;
    String name;// if we do not specify that it is public or private then
    // it works as private for another packages but for same packages it will work as public.
    int[] arr;

    public int getNum() {  // public means you can access it anywhere.
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
