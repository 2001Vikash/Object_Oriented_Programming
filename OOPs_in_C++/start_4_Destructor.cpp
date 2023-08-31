#include<iostream>
#include<bits/stdc++.h>
using namespace std;

/*
   Destructor => It is used to de-allocate the memory.
                so at the time of creation of class it is created bydefault 
                and whenever code is over means if we will be at return 0 in main then before this
                it will be called and de-allocated the memory.
                we can also create it via self.
                It is named as class name.
                there is no any return type and as well no input parameter.

    But according to this properties it like as constructor then what is difference
    so difference is destructor will also start with class name but with ~(negation) sign. 
    and it will be also call one time when object will be deleting.

    Note => For static allocation object destructor will be called automatically but for the
            dynamic allocation object we have to called distructor manually.           
*/

class Hero{
   public: 
    int health;
    int level;
 
    Hero(){
        cout << "Simple constructor is called" << endl;
    }

    // destructor
   
   ~Hero(){
    cout << "Destructor is called" << endl;
   }

};

int main(){

// static
    Hero a; // for this, destructor will be called automatically.
    

// Dynamic
 
   Hero *b = new Hero(); // but for this, we have to call destructor manually.

   delete b;// for destructor calling.


   return 0;

   // There is home work for me.
   // What is const, how it will be used in object creation.
   // what is data member in this, how to make function as const.

   // what is initialisation list.

}
