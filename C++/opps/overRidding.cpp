#include<bits/stdc++.h>
using namespace std;

class Scooty{
public:
   int topSpeed;
   float mileage;

   virtual void sound(){   // virtual keyword
     cout << "vroom vroom"<< endl;
   }
};


class Bike : public Scooty{
public:
   int gears;
   void sound(){
    cout << "dhroom dhroom" << endl;
   }
};





int main(){
    // Bike b;
    // Bike *b = new Bike();  // object pointer
    // b->sound();

    // Scooty *s = new Scooty();  // object pointer
    // s->sound();


    Scooty *b = new Bike();  // this is also possible
    b->sound();



    return 0;
}