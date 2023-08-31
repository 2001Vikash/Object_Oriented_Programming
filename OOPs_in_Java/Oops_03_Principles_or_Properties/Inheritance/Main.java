package com.Kunal.Oops_03_Principles_or_Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
        // here we are not able to access child class properties with parent class object
        // if we want to access then we need to make another class object for the child class
//        System.out.println(box1.l + " "+ box1.h+" "+ box1.w);
//        Box box2 = new Box(3.5);
//        System.out.println(box2.l + " "+ box2.h+" "+ box2.w);
//        Box box3 = new Box(3,4,5);
//        System.out.println(box3.l + " "+ box3.h+" "+ box3.w);
//        Box box4 = new Box(box1);
//        System.out.println(box4.l + " "+ box4.h+" "+ box4.w);

//        inheritBox box5 = new inheritBox();
//        System.out.println(box5.l+" "+ box5.h+" "+ box5.w+" "+box5.weight);
//        inheritBox box6 = new inheritBox(3,4,5,6);
//        System.out.println(box6.l+" "+ box6.h+" "+ box6.w+" "+box6.weight);

//        Box box = new inheritBox(2,3,4,5);
//        System.out.println(box.l);// but will not work box.weight.

        // vice versa is not possible.

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the reference type i.e. inheritBox
        // hence, you should have access to weight variable.
      //  inheritBox box2 = new Box(); this will give error.


        /*
        Types of inheritance

        1-> Single Inheritance --> One class extends another class for ex Box and inheritBox

        2-> Multilevel Inheritance -> Means if a class has child class and that child class have also
                                      a child and that is behaves as parent class of this new child class and so on that is known as Multilevel Inheritance
           we know that above class have not idea about down classes but all down classes have idea about above classes due to parent class

        3-> Multiple Inheritance --> one class extending more than one classes
                                     for ex A,B and C have properties of A,B like that.
            Multiple Inheritance is not supported in java because of ambiguity means
            for ex. if create an object of C class and try to access c.n and n is present in both classes A and B
            then the problem is that which one is pick as answer not clear that's why java do not allow this.

            We will do this in Interfaces.


      4 -> Hierarchical Inheritance -> One class is inherited by many classes
                                       same as Single Inheritance with multiple things.
                                       class A extend box, class B extends B and so on like that we can make it.

     5 -> Hybrid Inheritance -> It is a combination of Single and Multiple Inheritance but not allowed/support in Java
                                to use it check Interfaces lectures

         */


        BoxPrice box = new BoxPrice();
        BoxPrice box2 = new BoxPrice(4,5,4);

    }
}
