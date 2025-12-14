#include<bits/stdc++.h>
using namespace std;


int main(){

    try{
        int *p = new int[100000000000];
        cout << "Memory allocation is successfull"<< endl;
        delete []p;
    } catch(const exception &e){
        cout << "exception Occured : " << e.what() << endl;
    }
   

    return 0;
}