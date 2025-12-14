#include<bits/stdc++.h>
#include<fstream>

using namespace std;

int main(){
    // open and read the data 
    ifstream f;
    f.open("zoom.txt");
    char c;
    // f>>c;  // is method se space count nhi hoga
    // c = f.get();  // space ko bhi read krega 

    // cout<<c<<endl;


//   f.seekg(0,ios::beg);
//     cout << f.tellg()<<endl;
//     cout << (char)f.get()<<endl;



//      f.seekg(3,ios::beg);
//     cout << f.tellg()<< endl;
//     cout << (char)f.get()<<endl;


//     f.seekg(5,ios::cur);
//     cout << f.tellg()<< endl;
//     cout << (char)f.get()<<endl;
   




    while(!f.eof()){
        c = f.get();
        cout<< c;
    }

    
    f.close();

    return 0;
}