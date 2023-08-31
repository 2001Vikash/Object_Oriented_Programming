/*
   If we are using multiple inheritance and  C inherits class A, and class B.
   Assume that in class A and class B one function exists with same name then when we make object of C
   and call that function then which one will be called that is problem which is know as 
   Inheritance Ambiguity.

   To avoid this ambiguity we use Scope Resolution Operator let us see.
*/

#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class A{
    public: 
      int a;
      void print(){
        cout << "In class A" << endl;
      }
};

class D{
    public:
       int d;
       void print(){
         cout << "In class D" << endl;
       }
};

class C: public A, public D { 
     public:
       int c,a;
       void printC(){
        cout << "C <- A and D" << endl;
       }
};

int main(){

   C c;
   c.printC();
  // c.print(); // kaun sa call hoga A wala ya D wala. It means print is Ambiguious.

 // So to remove this problem we use Scope resolution operator.

 c.A::print(); // print from A
 c.D::print(); // print from D



    return 0;
}

