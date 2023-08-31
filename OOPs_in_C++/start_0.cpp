
 #include<iostream>
 using namespace std; // these two things will be present always in starting.
 
 /* 
     What is Oops ? 
     It is a type of programming technique, programming paradime, where things will be revolving
     around the objects, classes.

     Object -> It is a type of entity consisting two things one is state or properties and second 
               one is behaviour. for ex. camara, laptop, real word things.
               we use it to make our project to come up near with Real word.
               to improve readability, usability, easy for manage etc.
               for ex. if we assume a Hero in any area so to know more about that person we must
               have knowledge about that Hero mean his properties.
               so his properties like, name, health issue, level of education, behaviour like
               attack, defence, daance , singing etc.
 
    Class -> It is nothing but user-defined data type.
             for ex. we know that we have some predefined data type in c++, like int, char, string
              So if a user want to make his data type then he can use classes.
              for ex. if we want to make Hero data type and variable like Ramesh.
              because we know that if we have int then we have to give it a varialbe name like int a.
              same thing will happen in case of object that is our Hero and variable name can be anything
              like Hero Ramesh, Hero Suresh etc.
              means if a user make its custom data type that will be called as Class.

     Note : Object is an instance of class.         
 */


// Let us implement it.

// creation of class

class Hero{

    // properties
    int health;

    // if our class  will be empty then at the time of creation of object it will give 1 byte size
    // for indentification of class, for taking track.
};

// we can make this class in some other new file and we can use that with 
// the help of #include "Hero.cpp"

int main(){

    // creation of object of Hero type.

    Hero h1;

    cout << "Size : " << sizeof(h1) << endl;
    // we know that int will have 4 bytes and in class only one properties that's why it will give 4.

    return 0;
}
 