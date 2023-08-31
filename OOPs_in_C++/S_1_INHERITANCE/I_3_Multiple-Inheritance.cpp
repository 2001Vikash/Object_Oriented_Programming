#include<iostream>
#include<bits/stdc++.h>
using namespace std;

// In Multiple inheritance two or more classes inherited with one class.

class Animal{
  public:
    int weight;
    int age;

    void speak(){
        cout << "Speaking" << endl;
    }  
};

class Birds{
    public:
     int speed;
     int age;

     void bird(){
        cout << "churping" << endl;
     }
};



class Mixer : public Animal, public Birds{

   public :
   void single(){
   cout << "That is Multiple inheritance example" << endl;
   }
};

int main(){
   
   Mixer d1;
   d1.speak();
   d1.bird();
   d1.single();

    return 0;
}