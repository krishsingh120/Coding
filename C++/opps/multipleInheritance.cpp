#include<bits/stdc++.h>
using namespace std;


class Animal{

    public:
    int age;
    int weight;

    public:
    void bark(){
        cout << "barking"<< endl;
    }

};



class Human{

    public: 
    int height;
    string color;

    public:
    void speak(){
        cout << "speaking"<< endl;
    }

};


class Harsh : public Animal, public Human{

};



int main(){
   Harsh obj;

    obj.speak();
    cout << obj.age << endl;

    obj.bark();
    cout << obj.height << endl;
   

    return 0;
}