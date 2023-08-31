package com.Kunal.Oops_06.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;
    public Student (int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks +" " + rollNo;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;

        // if diff is 0 then both are equal
        // if diff < 0 : means o is bigger else o is smaller
    }
}
