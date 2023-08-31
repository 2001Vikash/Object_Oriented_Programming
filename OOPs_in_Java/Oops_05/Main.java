package com.Kunal.Oops_05;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career("Engineer");
        Daughter daughter = new Daughter();
        daughter.career("Doctor");

        // We can not create object of an Abstract class like Parent k = new Parent() -> it will give error
    }
}
