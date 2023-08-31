package com.Kunal.Oops_02;// it is nothing but showing path of this file where it lies.
// com is a folder and inside that there is a kunal folder.
// if we create there another folder it will look like com and inside it kunal , another name.

// create compartment and folders for our classes\
// if we want use two classes with same then It will not allow and here packages come in to the action
// we can create different packages for that.

// In simple terms a package is just folder where we can put  our different classes
// If file in another packages then for use we need to import that files
// But both files in same packages then we do not import.




//   Static....


public class Oops_02_Packages_Static_Singleton_Class_In_Built_Methods {
    public static void main(String[] args) {
       // why main is static because main is first thing which is run first in java program
       // then without creating any object of that class where main is , we can use it if it is static
       // that's why main is static.

        // static thing actually belong to the class , do not belong to the object.

      //  greeting();// it will give error because

        // In static method we can not use any non-static method that's why we need make greeting static as well
        // to use in a static method.
        // we know that if something is belong to the no-static means these things are belongs to the object.
        // or we can say that not static method belongs to an instance like that.

        fun();
    }
    static void fun(){
        //greeting(); // here also we can't use it due to no-static.

        // You can not access non-static stuff without referencing their instances in a static context.
        // if we want to access then we can go like that.

//        Oops_02_Packages_Static_Singleton_Class_In_Built_Methods obj = new
//                Oops_02_Packages_Static_Singleton_Class_In_Built_Methods();
//        obj.greeting();
        // but

    }
    void fun2(){
        greeting();
        // here we can use greeting here because we know that end it will definitely called via a static method
        // so here greeting() says to fun2() hey I have not any object can you allow to me for run
        // then fun2() will say to greeting() do not worry I have also need of a object because I am also non-static|
        // so whenever I will found my object then you can use my object.
    }
    void greeting(){
        fun();// but here we can use static things
         // because greeting is not limited as static or anything that's why we can use static method as well.



        System.out.println("Hello");
    }
}
