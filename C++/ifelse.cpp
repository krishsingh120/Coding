#include<bits/stdc++.h>
using namespace std;

int main (){
    int age;
    cin >> age;
    if(age > 18){
        cout << "you are adult";
    } else if(age == 18){
        cout << "you are just touch the line of adult life";
    } else {
        cout << "you are kid";
    }

    return 0;
}