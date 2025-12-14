#include<bits/stdc++.h>
using namespace std;

int main(){
    int a,b;
    cin >> a >> b;

    try{
        if(b==0)  throw "divide by zero is not possible";
        int c = a / b;
        cout << c << endl;
    } catch(const char *e){
         cout <<"Exception Occure : " << e << endl;
    }


    return 0;
}