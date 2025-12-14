#include<bits/stdc++.h>
#include<fstream>

using namespace std;

int main(){
    // file ko open krna 
    ofstream f;
    f.open("zoom.txt", ios::in | ios::ate);  // agar file present ni huui to khud se create kr dega or open bhi kar dega!!
    // fhir uspe write krna 
  
    cout << f.tellp() << endl;
    f.seekp(6, ios::beg);

    f<< "world";



    // f<<"hello coders" << endl;
    // f<<"hello coders kese ho sbhi ";

    









    f.close();

    return 0;
}