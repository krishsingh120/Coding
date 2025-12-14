#include<bits/stdc++.h>
using namespace std;

class Complex{
    int real,img;    // private
    public:
    Complex (){   // default constructor 

    }

    Complex(int real, int img){
        this->real = real;
        this->img = img;
    }

    void display(){
        cout << real << " + " << "i"<< img << endl;
    } 

    Complex operator +(Complex &c){
        Complex ans;  // iske liye default constructor banana pada 
        ans.real = real + c.real;  // real->c1 & c.real->c2
        ans.img = img + c.img;
        return ans; 
    }


};


int main(){
    Complex c1(3,2);
    Complex c2(4,6);

    c1.display();
    c2.display();

    Complex c3 = c1 + c2;   // c1.func(c2)
    c3.display();

    return 0;
}