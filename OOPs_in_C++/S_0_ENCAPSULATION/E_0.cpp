#include<iostream>
#include<bits/stdc++.h>
using namespace std;

/*
   Encapsulation -> wrapping up data members and functions. after wrapping we will find one entity
                    and we saying that we have acheived encapsulation.
                    means we wrap the all data members and functions in to one single entity.
                    where data members are properties/state, function can be behaviour/methods.

              But what is capsule, that is class. 

    Fully encapsulated class -> in this all data members are marked as private. means access is possible in the class only not for out side.

    To understand encapsulation we can use another name as "Information Hiding"/"Data Hiding".
    but Abstraction is called "Implementation Hiding".

    Why? -> Advantage :: 1. Due to this we can use data hiding because we use private.
                         2. So due to data hiding we can increase security in the system.
                         3. We can make class read only if we want. because we know that if data member is private then we can access that using getter and setter method, so if we use only getter method then we can make it only readable.
                         4. Code reusability.
                         5. Unit testing, means easy in managing.           
*/

// Implementation of Encapsulation.

class Student{
   private :
      string name;
      int age;
      int height;

   public :
     int getAge(){
        return this->age;
     }   
};

int main(){
    Student first;
    cout << "All is right" << endl;
    return 0;
}