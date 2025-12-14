#include<bits/stdc++.h>
using namespace std;

class A{

    public:
    void sayHello(){
      cout << "hello coders! "<< endl;
    }


    void sayHello(string name){   // function overloading sirf parameter pe depend krti hai return typr pe nhi!! 
      cout << "hello coders1! "<< endl;
    }

    int sayHello(string name,int s){
      cout << "hello coders2! "<< name<< endl;
      return s;
    }

};




int main(){
   A obj;
   obj.sayHello("krish");



    return 0;
}