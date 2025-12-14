#include<bits/stdc++.h>
using namespace std;

class Hero{
public:
   //property
   int health; 
   string str;
   static int timeTocomplete;

//    Hero(){   // constructor
//       cout << "print hello world" << endl;
//    }


   Hero(int health){    // paramerterised constructor
   cout << "this : " << this << endl;
     this->health = health;
   }

   //  // copy constructor
   // Hero(Hero& temp){
   //    cout << "copy constructor" << endl;
   //    this->health = temp.health;
   // }

   // destructor
   ~Hero(){
      cout << "destructor bhai called" << endl;
   }

   static int random(){
     return timeTocomplete;
   }

   
   // int getHealth(){
   //  return health;
   // }


   
   void print(){
      cout << " health : " << this->health << endl;
   }




};

int Hero::timeTocomplete = 5;


int main(){

   //  // destructor
   //  Hero a;   // static

   //  Hero *b = new Hero();  // dynamic

   //  delete b;

   cout << Hero::timeTocomplete << endl;
   cout << Hero::random() << endl;

   // Hero a;
   // cout << a.timeTocomplete << endl;
   





    //  creation of object -> (static allocation)
    // Hero h1;    //  h1 -> object
    // h1.health = 25;

//    Hero h1(10);
//    cout << "address of h1 : " << &h1 << endl;
//     h1.getHealth();

    // copy constructor 

   //  Hero h1(10);
   //  h1.print();

   //  Hero h2(h1);  // copy constructor call
   //  h2.print();

    // dynamically allocation
    // Hero *h1 = new Hero();
    // (*h1).health = 56;

    // cout<< (*h1).health << endl;
    // cout<< h1.getStr() << endl;


    return 0;
 
}