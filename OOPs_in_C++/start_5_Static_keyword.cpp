#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Hero{

public:
  int health;
  int level;
  static int timeToComplete;

  Hero(){
    cout << "Simple constructor called" << endl;
  }
  ~Hero(){
    cout << "Destructor is called" << endl;
  }

// Static function -> they don't have 'this' keyword and no need to create object. because this keyword is pointer to current obj but there is no any object
    //                they can access only static members.

    static int staticFunction(){
       // cout << this.health << endl; will  give error  because this hota hi nhi
       // cout << health << endl; ye bhi error because health is not static member.

      // cout << timeToComplete << endl; // now it's fine. 
      // but we have to return because there is return type.

      return timeToComplete;

    }
};

// so to use static member we have to initialize it
// sytax of initialization => dataType className::(scope resolution operator) fieldName/varaibleName = value.
int Hero :: timeToComplete = 5;

int main(){

    // we can access static member directly without cretation of object.

    cout << Hero :: timeToComplete << endl;

    // after the creation of object.

    Hero a;
    cout << a.timeToComplete << endl;

// Yes here it working but it is not recommended to access like that because it does not belong
// to the object, It belongs to the class.
// We can update it via logicwise but try to access via name of class means without using of Obj.

  cout << Hero :: staticFunction() << endl;

    return 0;
}