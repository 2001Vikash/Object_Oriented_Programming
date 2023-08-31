#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Hero{
 public:
    int health;
    int level;
    //char name[100]; // this is not a good practice we will make object and allocate in heap due to more space.
    char *name;
   
   Hero(){
    cout << "Simple constructor called" << endl;

    // here we will initialize array when object is created.

     name = new char[100];// dynamically allocation
   }

   void setName(char name[]){
    strcpy(this->name, name);
   }

   void print(){
    cout << endl;
   // cout << "[ Name : " << this->name << ", ";
    cout << " [ Health : " << this->health << ", ";
    cout << "Level : " << this->level << " ]";
    cout << endl;
   }

/*
     previously we have seen about constructors
     but here we will talk about the Shallow and Deep copy

     so We know that we have inbuilt or default copy constructor that will be used for copy the
     objects from one to another.

     So basically Default copy constructor works on Shallow copy.

     Shallow copy -> We use same memory(for name) for both Objects in case of name array. 
     Deep copy -> We use copy of the first name for second object means accessing will be happened
                  from different-2 memory.

     So we know that default constructor work based on Shallow copy, means we have to make
     our own copy constructor in this case default constructor will be removed.             
*/ 

  // copy constructor based on Deep copy.

  Hero(Hero &temp){
    // naya array banate hai.
    char *ch = new char[strlen(temp.name) + 1]; // +1 for null character.
    strcpy(ch, temp.name);
    this->name = ch;

    // copy constructor called
    this->health = temp.health;
    this->level = temp.level;
  }


   Hero(int health, char level){
        this->health = health;
        this->level = level;
   }
};

int main(){

   Hero h1;
   h1.health = 70;
   h1.level = 'A';
   char name[7] = "Babbar";
   h1.setName(name);
 //  h1.print();

/*
   // make another object using default copy constructor.
//    Hero h2;
//    h2 = h1;

// or
     Hero h2(h1);
     h2.print();

     
     // change the value of h1.name[0];

     h1.name[0] = 'G';
     h1.print();
     h2.print();

     // So here we changed only in h1 then why did change happened in h2 ?
     // due to shallow copy , if we don't want like this then use deep copy.



// Here change will not be happen because we are using deep copy.
   
   Hero h2(h1);
   h2.print();
   
   h1.name[0] = 'G';

   h1.print();
   h2.print();
*/


  // Copy assignment operator -> In this we have two objects already created
                            //   and if we want to copy then we can use a = b, b ke sare a me honge.   


    Hero h2(10, 'A');
    h2.print();
    Hero h3(20, 'B');
    h3.print();

    // copy assignment operator
    h2 = h3; // instead of writing every case we can do it via this way.
    h2.print();

    return 0;
}
