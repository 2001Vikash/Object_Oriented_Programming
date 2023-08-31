package com.Kunal.Oops_03_Principles_or_Properties.Encapsulation;

public class definition {

    /*

    Encapsulation -> wrapping up the implementation of the data members and methods in class

          It basically hides the code and data into a single entity or an unit that can be protected by outer world

           Abstraction is design level issue and Encapsulation is implementation level issue this is different between both

           I think that
           Encapsulation is nothing but it is internal part of Abstraction which is hiding for users
           means whatever internally work in come in Encapsulation and Abstraction working for external thing
           ki kya dikhana hai user ko aur kya nahi to ye kya nahi wala part hi Encapsulation dwara kiya jata hai.


           Abstraction is process of gaining information and Encapsulation is process of containing information
     */

    private int l = 10;
    // here it is known as data hiding and we are able to access it using Encapsulation
    // Encapsulation is subprocess of data hiding and data hiding is achieving via Encapsulation

    // what is difference between data hiding and Encapsulation ->

    // data hiding is focusing on data security and Encapsulation focuses on hiding the complexity of the system
    // In data hiding we make things private but in Encapsulation have may be public etc.

    // we are not able to access this private things but still we are able use it using this getL method
    public int getL(){ // this is Encapsulation
        return l;
    }

    public static void main(String[] args) {

        definition obj = new definition();
        System.out.println(obj.getL());
    }
}

