#include<iostream>
using namespace std;

// We will not using class in other file we will make it over here explicitely
// that will be more easy to understand.

//public : in c++ we will make data members as public or private not for the class like java.
class Hero{

    // properties.

// let see meaning of public 
// if we make these data members as public then we can access everywhere.

   public :
    char name[100];
    // public : if we put here then name will be private and remaining things will be public.
    int health;

    private :
    char level;


    void print(){
        cout << level << endl;
    }
};

class Hero1{

  public :
    char name[100];
    int health;
    char level;

};

class Hero2{

  private :
    char name[100];
    int health;
    char level;

    // let us assume that we have only private data members then how will we access these.

    // It will be possible via the using of getter and setter method.

    // we know that if something is private then we can not access that so to access that we
    // have a way that is getter and setter.

// but we have to make these getter and setter as public


// getter
  
   public :
    int getHealth(){
        return health;
    }
    char getLevel(){
        return level;
    }

    // setter

    void setHealth(int h){
        health = h;
    }
    void setLevel(char ch){
        level = ch;
    }
    // we can make setter with some condition like if this is right password then do it.

    void setLevel(char ch, char pswrd){
        if(pswrd == 'A'){
            level = ch;
        }
    }

};

class Hero3{
public :
   int health;
   char level;
};


class Hero4{
public :
   int health;
   char level;

   // there is an default constructor which is seeing here but we can make it via our own.


    Hero4(){ 
    // this is  constructure which works bydefault. If we are not making.
   // return type specification for constructor is invalid
   // means we can not make void or anything like int, char, string etc.
   // generally if we do not want to return anything then we will use void function
   // but in case of constructor we can not use void as well because this is constructor not like a normal  function.

     cout << "Constructor called" << endl;

     // when we will right our own constructor then after that default constructor will be removed autometically.
     
   }

   // Parameterized constructor.
   // It is not a default constructor. so if we are making it then we have to write deafult
   // constructor as well if make object without any parameter because default will be removed. then it will throw error.

   Hero4(int health){
    //health = health;
    // if we doing this then it will access that which in too near in the scope.
    // if we want to put it in our original health which is a part/data member of our class
    // then we have to use "this" keyword.

    // this -> whichever we have current Object, in this keyword that address will be presented.
    // means this is a pointer that is pointing to our current Object. jaha se call mari hai.

   // this.health = health; this wrong statement because we know that this is pointer type.
   // so we can not do like that with pointer this.health means 'g' object ke health ki value.

    // (*this).health = health;
     // or 
      // this->health = health;

     // verify that is a pointer
     cout << "this -> " << this << endl;
     this -> health = health;
   }

   Hero4(int health, char level){ // with two parameterize constructor.
    this->level = level;
    this->health = health;
   }

   void print(){
    cout << "Health : " << this->health << endl;
    cout << "Level : " << this->level << endl;
   }

   // So we saw deafult constructor, parameterized constructor and we have another constructor
   // as well named as copy constructor. means here it will help the cpying the object.
   // and this is also a bydefault constructor.

   // and we can make it via our own

   Hero4(Hero4 &temp){
    this->health = temp.health;
    this->level = temp.level;

    // why '&' -> because here we using pass by reference.
    // now same thing happan will here as well means default constructor will be removed.
   }

};


int main(){

 //  Hero ramesh;

   // if we want to access data items/functions or properties of class in object then we will have to use 
   // dot(.) operator.

 //  cout << "Health is : " << ramesh.health << endl;
 //  cout << "Health is : " << ramesh.name << endl;
   
   // Let us see why it is giving error as health, level, name are private.
   
   // this why because we have to know about access modifiers.

   /*
     Access Modifiers ->
                        there are three types of access modidfier.
                        public, private, and protected.

      actually it means that whatever properties we have in the class where we can Access that 
      all those properties like can we access that out of that class, or with in the class,
      or in the child class etc.
      that will be provided by Access Modifiers.

   Note -> Bydeafault in c++ in every data member is used private modifier.

  let see meaning of public 
  if we make these data members as public then we can access everywhere.

  private : it can be accessible in only that class. like if we have some behaviour/ functions
            in class then we can access if that will be private data member.

     protected we will see later.   

     Note => public : in c++ we will make data members as public or private not for the class like java.    
   */


    Hero1 ramesh;

    // how to set value because we know that if we do not give any value that it gives garbage value

    ramesh.health = 70;
    ramesh.level = 'A';

   //  cout << "Health is : " << ramesh.health << endl;
   //  cout << "Level is : " << ramesh.level << endl;


   // via getter and setter

   Hero2 mahesh; // so this is nothing but object instantiation. means making instance of a class.


   mahesh.setHealth(70);
   mahesh.setLevel('A');
   mahesh.setLevel('A', 'A');

 //  cout << "Mahesh health : " << mahesh.getHealth() << endl;
  // cout << "Mahesh level : " << mahesh.getLevel() << endl;


// Static allocation 
   Hero3 h1;

   // Dynamic Allocation

   Hero3 *h = new Hero3; // this memory is allocated in heap insort.

   // in this we are making a Hero3 type of pointer which is pointing in heap memory where the value is.
   // and we know that to point in Hero3 have address of heap.

   // to access data items we use (*variable name).data member name.

   (*h).health = 80;
   (*h).level = 'B';
//    cout << "h health is : " << (*h).health << endl;
//    cout << "h level is : " << (*h).level << endl;
   // why *h => we know that h is address which is pointing somewhere means jaha value hai.
   // that's why we did h reference means we are accessing the value which is at address h.

   // other way to do it or Alternative way to do it.
   // that is instead of using (*h). we can use 'h->' means with the help of Arrow.

   h -> health = 90;
   h -> level = 'C';
//    cout << "h health is : " << h -> health << endl;
//    cout << "h level is : " << h -> level << endl;


    cout << "Hi" << endl; // first it will call after that constructor.
    // statically allocation
    Hero4 suresh; // if we run without doing anything then constructor will be called.
    Hero4 *s = new Hero4; // dynamically allocation.
    // or
    Hero4 *r = new Hero4();//same for without parenthesis.
    // in both case either obj will be static or dynamic same constructor will be fired.

    /* what is happening behind the scene so whenever we making/triggering an Object in the 
       main function then a Constructor is calling from the main system via the Hero4 suresh;
       Costructor which is in the class, If we are not making this then it will work bydefault.

       Constructor -> It will be invoked at the time of Object creation.
                      there have no any return type.
                      and basic cosntructor/bydefault have not any parameters.
                      it means it is like a function which in class and invoke at the time of obj creation
                      bydefault it will be called as ramesh.Hero().
                      It is named as class name means constructor function name is same as class name.

  */
    
    // suresh.level = 'A';
    // cout << "Level : " << suresh.level << endl;

    Hero4 *g = new Hero4(80); // it will not print if we will not use this keyword in constructor.
  //  cout << g->health << endl;


// statically kiye hai to this and v ka same address aa rha hai.
    Hero4 v(10);
   //  cout << "Verify : " << &v << endl; // it will show the address of g in heap.
    
    

    Hero4 ganesh(10, 'A');

    // and we are saying that make an another object and copy the ganesh in that.
    ganesh.print();

    Hero4 ritesh(ganesh); // ye jisko call karega o copy constructor hoga.
    // and it is also work as default when we make a class at that time it will be created bydefault.
    ritesh.print(); 
    return 0;
}