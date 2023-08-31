#include<iostream>
#include<bits/stdc++.h>
using namespace std;

// In single inheritance one class is inherited in another class.

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
   cout << "That is single inheritance example" << endl;
   }
};

int main(){
   
   Dog d1;
   d1.speak();
   d1.single();

    return 0;
}