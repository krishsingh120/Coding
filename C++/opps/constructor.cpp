#include<bits/stdc++.h>
using namespace std;

class Student{    // student is a new data type
public:
   string name;
   int rno;
   float marks;
   Student(){  // Default constructor
       cout << "heello ";
   }

   Student(string name , int rno, int marks){  //  parameterised constuctor
      this->name = name;
      this->rno = rno;
      this->marks = marks;
   }
  
};



int main(){
    Student s1("krish singh", 47, 92);
    // s1.name = "krish singh";
    // s1.marks = 69.9;
    // cin>> s1.rno;
    cout << s1.name << " " << s1.rno << " " << s1.marks << endl; 

    Student s2("my babe❤️", 48, 95);
    s2.name = "coding";
    s2.marks = 89.9;
    s2.rno = 37;

    cout << s2.name << " " << s2.rno << " " << s2.marks << endl;  


    Student *s3;
    (s3)->name = "hakku matata";
    (*s3).marks = 86;
    cout << (s3)->name << " " << s3->marks;





    return 0;
}