#include<bits/stdc++.h>
using namespace std;

// pass by value
void PassByValue(int num){  // num --> argument 
    cout << num << endl;
    num += 5;
    cout << num << endl;
    num += 5;
    cout << num << endl;
}

// pass by refrence 
void PassByrefrence(int &num){  // num --> refrence
    cout << num << endl;
    num += 5;
    cout << num << endl;
    num += 5;
    cout << num << endl;
}

// arrays pass by refrence

int main (){
    int num = 10;
    PassByValue(num);
    cout << "pass by value : " << num << endl;
    PassByrefrence(num);
    cout << "pass by refrence : " << num << endl;
}