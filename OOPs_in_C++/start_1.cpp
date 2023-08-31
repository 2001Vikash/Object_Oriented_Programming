#include<iostream>
#include "Hero.cpp"
using namespace std;

int main(){

// if we do not include Hero.cpp then we can not use this object over here.
    Hero h1;

    cout << "Size : " << sizeof(h1) << endl;

    return 0;
}