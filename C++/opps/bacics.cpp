#include<bits/stdc++.h>
using namespace std;

class Student{    // student is a new data type
public:
   string name;
   int rno;
   float marks;
};




class Car{    // student is a new data type
public:
   string name;
   int price;
   int seat;
   int bhp;
};

int main(){
    Student s1;
    s1.name = "krish singh";
    s1.marks = 69.9;
   //  s1.rno = 47;
    cin>> s1.rno;

    Student s2;
    s2.name = "coding";
    s2.marks = 89.9;
    s2.rno = 37;

    cout << s1.name << endl << s1.marks << endl << s1.rno << endl;  
    
    return 0;
}