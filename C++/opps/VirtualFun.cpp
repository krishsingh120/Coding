#include<bits/stdc++.h>
using namespace std;

class Animal{
    public:
     virtual void speak(){   // parent class ka -> virtual function use
        cout << " hui hui" << endl;
    }
};

class Dog : public Animal {
   public:
    void speak(){
        cout << " bark " << endl;
    }

    void roti(){   
        cout << " hello "<< endl;
    }


};

int main(){

    Animal *p;
    p = new Dog;
    p->speak();

    // p->roti();  // error dega kyki p-> animal class ka ptr hai or roti func usme present nhi hai 

    return 0;
}