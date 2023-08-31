package com.Kunal.Oops_02.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population ; // it is common for all human we are try to know no. of human
// it's independent on object we can use it without creating any reference, or objects.
   public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
     //   this.population += 1; // here we access via instance name
       // instead of this we can use class name as well
       Human.population += 1;
    }
}
