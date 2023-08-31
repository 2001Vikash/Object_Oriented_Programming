#include<iostream>
#include<bits/stdc++.h>
using namespace std;


/*
   Inheritance -> It means if we have a class which has some methods and properties, so that 
                  things if we inherit/dal dena in another class that is known as Inheritance.
                  so whoever inherit the properties of class that will be known as Child/sub-class
                  and whose properties is taken by child class that will be known as Parent/super-class.
     Modes of Inheritance -> public, private, protected.  

    Protected => It is similar kind of Private but not exactly same.
                Here if data members are protected then we can not access out side and
                we can access with in the class but
                with one condition -> that is child/ or child's derived class can access with in the class
                                      if we want to use outside then we have to use getter/setter in child class.

   Note : But if we have private data members in base class then we can not inherit with any mode.                                   
*/


// Public Mode :

// Parent class.

class Human{
    public :
       int height;
       int weight;
       int age;

    public:
       int getAge(){
          return this->age;
       } 
       void setweight(int w){
          this->weight = w;
       }  
};

// Male class.

// Child class

class Male: public Human{
     public :
         string color;

     void sleep(){
        cout << "Male is Sleeping" << endl;
     }    
};

class Female: protected Human{
   public :
       string color;

       void sleep(){
        cout << "Female is sleeping" << endl;
       }

       // here we can not access inherited properties from out side of the class,
       // but with in class we can use it means we have to make getter/setter.
     
       int getHeight(){
        return this->height;
       }
       void setHeight(int h){
        this->height = h;
       }
};

int main(){

    Male obj1;

   // obj1.      // So here we can see that there are all properties of parent class(Human) and child class.
   
   cout << "Male age : " << obj1.age << endl;
   cout << "Male weight : " << obj1.weight << endl;
   cout << "Male height : " << obj1.height << endl;

   cout << "Male color : " << obj1.color << endl;

   obj1.sleep();
   obj1.setweight(10);
   cout << "Male weight : " << obj1.weight << endl;

   // Both class have different value of properties if we are providing.

   Human h1;
   h1.weight = 28;
   cout << h1.weight << endl;
   cout << obj1.weight << endl; // both will be different inheritance means take only property not their value.

   // Means male class inherit the property of Human class that's why it can access the property of Human class aur apna bhi.

  // Note : private data member of any class can not be inherited.

     Female f1;
     f1.setHeight(12);

     cout << f1.getHeight() << endl;
     f1.sleep();

    return 0;
}

// Types of inheritance => Single, multiple, multilevel, hybride, hierarchical.