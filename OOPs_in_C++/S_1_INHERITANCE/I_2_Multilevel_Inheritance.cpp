#include<iostream>
#include<bits/stdc++.h>
using namespace std;

// In Multilevel inheritance one class is inherited in another class and
// that class will be inherit in another class and so on.

class Animal{
  public:
    int weight;
    int age;

    void speak(){
        cout << "Speaking" << endl;
    }  
};

class Dog : public Animal{

   public :
   void single(){
   cout << "That is Multilevel inheritance example" << endl;
   }
};

class GermanShepherd: public Dog{
    public :
      void next(){
        cout << "Inherit Dog" << endl;
      }
};

class anotherDog: public GermanShepherd{

};
// and so on in level wise.

int main(){
   
   GermanShepherd d1;
   d1.speak();
   d1.single();
   d1.next();

    return 0;
}