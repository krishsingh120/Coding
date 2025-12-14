#include<bits/stdc++.h>
#include<fstream>

using namespace std;

int main(){
    int arr[]= {1,2,3,4,5};
    // cout<< "enter number : ";
    // for(int i=0; i<5; i++){
    //     cin>>arr[i];
    // }
     
     ofstream f;
     f.open("zero.txt");  // open file

    //  f<< " original data\n";
     for(int i=0; i<5; i++){
        f<< arr[i] <<" ";
     }


     f.close();


    return 0;
}