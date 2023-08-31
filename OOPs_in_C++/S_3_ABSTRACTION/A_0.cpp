#include<iostream>
#include<bits/stdc++.h>
using namespace std;

/*
   Abstraction -> Another way to understand it , "Implementation Hiding".
                  means whatever will be required or essential things show them instead of showing
                  all things from the implementation part.
       for ex. If we want to send E-mail then we know that how to write mail and send it.
       but we don't care about that for sending which protocol is using or networks and so on
       means all those things/implementations are hidden for us that is Abstraction.

       for this we can use access modifiers like private to hiding implementation from out side.


   Advantages : 

        1. Only you can make changes to your data or functions and no one else can.
        2. It makes the application secure by not allowing anyone else to see the background details.
        3. Increase the reusability of the code.
        4. Avoid duplications of your code.                

*/

class A {
  private: 
    int a, b;

 public:
   void set(int x, int y){
       a = x;
       b = y;
   }   

   void diplay(){
    cout << "a : " << a << ", b : " << b << endl;
   }
};

int main(){

    A obj;
    obj.set(10, 20);
    obj.diplay();
    return 0;
}