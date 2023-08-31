package com.Kunal.Oops_07.EnumExamples;

public class Basic {

    // Enums -> These are group of variables that you can't change means it's like a constant.
    // like months in a Year that is 12. and we can't change it because it is fix.

    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are called as enum constants
        // Every single things which are here they are public, static and final
        //since it's final we can't create child enums
        // type of all are week.

        Week(){
            System.out.println("Constructor called for "+ this);
        }
        // this in not public or protected, only private or default
        // why? -> we don't want to create new objects  because this not the enum concept that's why.
        // internally : it is like this
                       // public static final Week Monday = new Week(); when constructor will call
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week);
        System.out.println(week.ordinal());// it gives the position of enum declaration
        //System.out.println(Week.valueOf("Monday")); return enum value that Monday for this


//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
    }
}
