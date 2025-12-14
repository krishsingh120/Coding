#include<bits/stdc++.h>
using namespace std;

class A{
    // int x = 5;
    int cm ;
    int m;



  friend void print(A& obj);

};

class B{
    // int x = 5;
    int ft ;
    int in;



  friend void print(A& obj);

};


void print(A& obj){
    cout << obj.x << endl;
}

void userInput(){  // derived outside the class 
    
} 


int main(){

    A obj;

    print(obj);


    return 0;
}