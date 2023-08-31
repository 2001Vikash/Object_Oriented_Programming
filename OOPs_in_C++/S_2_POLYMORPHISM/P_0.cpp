#include<iostream>
#include<bits/stdc++.h>
using namespace std;

/*
   Polymorphism -> It means that existing in multiple forms.
                  for ex. our father is existing in multiple form like 
                  for some as father, for some as, husband, for some as brother etc.
                  So we will say that here ploymorphism is happening.

  There are two types of Polymorphism -> Compile time polymorphism, Run time polymorphism.             
*/

/*
   Compile Time Polymorphism(static polymorphism) -> 
                     two types -> Function/method Overloading, Operator Overloading.

     => It is obtained by thorugh method overloadning, operator overloading.
        the term method overloading allows us to have more than one method with the same name.
        Since this process is executed during compile time, that's why it is known as Compile T. P.

    => Compile time is the period when the programming code (such as java, python) is converted
       to the machine code.
    => while Run time is the period of time when a program is running and generally occurs after
       compile time.       
*/

class A {
   public:  
      void sayHello(){
        cout << "Hellow bro !" << endl;
      }
// this is function overloading here both function have same name only difference in signature.
// that one an argument, another have not.

      void sayHello(string name){
        cout << "Hello " << name << endl;
      }

    //   int sayHello(){
    //     cout << "Hellow Bro !" << endl;
    //   } If we change only return type then function can not be overloaded.

    // we can do it with int return type but with different argument.

    int sayHello(string name, char c, int a = 0){// where a is default argument if we will not pass anything in function call then it will work.
        cout << "Hello " << name << c << endl;
        return 1;
    }

    // Means for function overloading we have to change in input argument, like increase no. of argument or change the type of argument.

};
/*
int main(){
   
   A a;
   a.sayHello();
   a.sayHello("Vikash"); 
   a.sayHello("Vikash", '!');

    return 0;
} */


/*
  Operator OverLoading =>  In c++ we have operator overloading as well for ex. we know that 
                          '+' operator is used for addition but we can use it as well for string
                          concatanation.
                          apart from two things we can use it for another work like print sayHello when we will use it.
                          we can not perform this, with ? operator, :: operator etc.
                          or can we use + for subtraction like that things we can perform.
*/

// We know that + is a binary operator like a + b, two operands required.

class B {
  public:  
   int a;
   int b;

   int add(){
    return a + b;
   }
   void operator + (B &obj){
    int v1 = this->a;
    int v2 = obj.a;
    cout << "Output : " << v2 - v1 << endl; 

    // OR 

    cout << "Hello Bro" << endl;
   }

   // we can also overload (), this.

   void operator()(){
     cout << "Mai bracket hu" << this->a << endl;
   }
};

/*
int main(){
    
    B obj1, obj2;

    obj1.a = 4;
    obj2.a = 7;

    obj1 + obj2; // here we are adding but output will be 3.

// OR

    obj1.operator+(obj2); // both are correct way to call the overloading function.

    // In sort whenever we write '+' then that operator overloading wala function call hoga aur 
    // kuchh bhi usme kr sakte hai aur o perform ho jayega.

    obj1();

    return 0;
}
   */


  /*

     Run Time Polymorphism (Dynamic Polymorphism) -> It will happen at the time of run-time.

                    Something are presented and at run time we know that oo this is existing in multiple forms.

      It is obtained by "Method Overriding".   

      Rules -> Method of parent class and child class have same name and parameters/argument.
               it is possible through inheritance only.
         Means Run Time Polymorphism is depend on Inheritance.                          
  
  */


 class Animal {
   public:
     void speak(){
        cout << "Speaking" << endl;
     }
 };

 class Dog : public Animal{
    public:
      void speak(){
        cout << "Barking" << endl;
      }
 };

 int main(){

    Dog d;
    d.speak(); // so ye confused hoga kaun sa speak Parent wala or child wala. and this is happening at run time.

    // but aisa nhi hua isne child class wala function ko call kiya isko kaise pta chla ?
    // because here we are making Dog class ka object means Dog ke andar wale speak ko call kre yadi o nhi hota to ye parent class wala call krta.
    // means apni khud ki implementaton likh diye hai to o call hoga aur yahi function overriding hai.

    // It is used when for ex. if in parent class have 10 methods then we will inherit in another class
    // but in child class, wants to  change in two function according to its requirements so we will do it via Method Overriding.
    // tabhi bhi to faida hi hai 8 function to nhi likhane padenge.

    return 0;
 }
