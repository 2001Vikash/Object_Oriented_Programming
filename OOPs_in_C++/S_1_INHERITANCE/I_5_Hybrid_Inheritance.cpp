// Hybrid Inheritance -> Combination of two or more types of Inheritance is known as Hybrid Inheritance.

#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class A{
    public: 
      int a;
      void printA(){
        cout << "A" << endl;
      }
};

class D{
    public:
       int d;
       void printD(){
         cout << "D" << endl;
       }
};

class C: public A, public D { // multiple and hierarchical inheritance combination.
     public:
       int c,a;
       void printC(){
        cout << "C <- A and D" << endl;
       }
};

class B : public A {
   public:
     int b;
     void printB(){
        cout << "B" << endl;
     }
};

int main(){

    C c;
    c.printA();
    c.printD();
    c.printC();

    B b;
    b.printA();
    b.printB();

    return 0;
}