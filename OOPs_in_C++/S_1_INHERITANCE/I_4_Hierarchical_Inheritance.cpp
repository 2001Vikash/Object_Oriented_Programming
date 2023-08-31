#include<iostream>
#include<bits/stdc++.h>
using namespace std;

// In Hierarchical inheritance one class is serve as parent class for more than one class.


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
   cout << "That is hierarchical inheritance example" << endl;
   }
};

class Lion : public Animal{
    public :
     void lion(){
        cout << "Roaring" << endl;
     }
};

class Cat : public Lion{
  public :
   void cat(){
    cout << "Cat is running" << endl;
   }
};

class Cat2 : public Lion{
   public :
   void cat2(){
    cout << "Cat2 is running" << endl;
   }
};

int main(){
   
   Dog d1;
   d1.speak();
   d1.single();

   Lion l;
   l.speak();
   l.lion();

   Cat c1;
   c1.lion();
   c1.cat();

   Cat2 c2;
   c2.lion();
   c2.speak();
   c2.cat2();

  // c2.single(); it will give error(no member) because this is from another side no access.


    return 0;
}