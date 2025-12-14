#include<bits/stdc++.h>
using namespace std;


class Car{    // student is a new data type
public:
   string name;
   int price;
   int seat;
   int bhp;
};

void print(Car c1){    // (data type, variable name)
    cout << c1.name << " " << c1.price << " " << c1.seat << " " << c1.bhp << endl;
}

void change(Car c){   // (&) -> use krte hai iska mtlb hai ki address pass kr rhe hai (refrence).
    c.name = "Thar";
    c.price = 2500000;
    c.seat = 6;
    c.bhp = 900;
    
}

int main(){
   Car c1;
   c1.name = "Toyota";
   c1.price = 2000;
   c1.seat = 5;
   c1.bhp = 200;

    print(c1);
    change(c1);  // pass by value
    print(c1);
  

//    Car c2;
//    c2.name = "Honda city";
//    c2.price = 1500000;
//    c2.seat = 5;
//    c2.bhp = 300;

//    Car c3;
//    c3.name = "Thar";
//    c3.price = 2000000;
//    c3.seat = 5;
//    c3.bhp = 600;


//    print(c1);
//    print(c2);
//    print(c3);

   
}