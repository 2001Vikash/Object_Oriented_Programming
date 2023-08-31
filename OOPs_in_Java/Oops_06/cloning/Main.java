package com.Kunal.Oops_06.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(34, "Kunal Kushwaha");
     //   Human twin =  new Human(kunal);

        // instead of doing this we create here a clone that more efficient than it.
        // because it takes more processing time

        Human twin = (Human) kunal.clone();
        System.out.println(twin.age + ", " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));// -> Shallow copy
        // it will also change that is known as Shallow copy
        // means -> in simple terms primitive will be copy as it as but not same for the object types
        // for object the reference variable will point same object.

        // and in Deep copy we create new object.
    }
}
