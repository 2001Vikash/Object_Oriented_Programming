package com.Kunal.Oops_06.Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(72, 89.72f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



        //  if(vy < ry){
        // we can't compare like this we need to put here compareTO
//        if(vy.compareTo(ry) < 0){
//            // here java will confuse that there are two parameters which one you want to compare ?
//            // In order to solve this problem we have to implement comparable interface which is Generic types things
//            System.out.println("Rahul has more marks than vy");
//        }
    }
}
