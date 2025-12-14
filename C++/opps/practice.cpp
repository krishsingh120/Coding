// Q1.
// #include<bits/stdc++.h>
// using namespace std;


// int Count = 0;

// class Test {
// public:
//     Test() {
//     Count++;
//     cout << "Count is" <<Count<< endl;
//     }

//     ~Test() {
//     Count--;
//     cout << "Count is" <<Count<< endl;
//     }
// };


// int main(){
//    Test t1;
//    Test t2;
//    Test t3;
//    Test t4;


//  return 0;
// }









// Q2.
// #include <bits/stdc++.h>
// using namespace std;

// void show (char c);
// void show (double d);

// void show (char c) {
//   cout << "Character is shown here" << c;
// }
// void show (double d) { 
//   cout << "Double is shown here" << d; 
// }



// int main()  { 
//     show('A'); // (i) 
//     show(12); // (ii)
//     show(20.5); // (iii) 
// }






// Q3.
// #include <iostream>
// using namespace std;

// class BankAccount {
// private:
//     int accountNumber;
//     double balance;
//     static int totalAccounts;
// public:
    
//     BankAccount(int accNum, double initialBalance) {

//         accountNumber=accNum;
//         balance=initialBalance;
//         totalAccounts++;
//     }


//     void deposit(double amount) {
//     balance += amount;
//     }

//     void withdraw(double amount) {
//         if (balance >= amount) {
//             balance -= amount;
//             cout<<"New balance is "<<balance<<endl;
//        }
//         else{
//         cout<<"\nYou dont have enough balance";
//         }
//    }


//     static int getTotalAccounts() {
//        return totalAccounts;
//     }


//     void displayAccountDetails() {
//         cout << "Account Number: " << accountNumber << endl;
//         //cout << "Balance: $" << fixed << setprecision(2) << balance << endl;
//         cout << "Balance: $" << balance << endl; 
//     }


// };


// int BankAccount::totalAccounts = 0;


// int main() {

//     BankAccount acc1(101,1000);
//     acc1.deposit(1000.0);
//     acc1.withdraw(500.0);
//     cout << "Total number of accounts created: " << BankAccount::getTotalAccounts() << std::endl;

//     BankAccount acc2(102, 1500.0);
//     acc2.deposit(2000.0);
//     acc1.withdraw(200.0);
//     cout << "Total number of accounts created: " << BankAccount::getTotalAccounts() << std::endl;


//    return 0;
// }





// Q4.
#include<iostream>
using namespace std;
// class dist2;

class dist1{
public:
   float mtr, cm;
 public:
    void accept() {
    cout<<"\n Enter Data in Meter & Centimeter : ";
    cin>>mtr>>cm;
    }
    friend void diff(dist1 d1, dist2 d2);
    friend void sum(dist1 d1, dist2 d2);
};

class dist2 {
    float feet, inch;
    public:
    void accept() {
    cout<<"\n Enter Data in Feet & Inch : ";
    cin>>feet>>inch;
    }
    friend void difference(dist1 d1, dist2 d2);
    friend void sum(dist1 d1, dist2 d2);
};



void difference(dist1 d1,dist2 d2){
    int n1, n2, n3, ans, m, c, f, in;
    n1=d2.inch*2.54;
    n2=d2.feet*0.30;
    n3=d1.mtr*100;
    ans=((d1.cm + n3) - (n1 + n2));
    m=ans/100;
    c=ans%100;
    cout<<"\n --------------------------------------------------------------------";
    cout<<"\n Difference in Meters & Centimeters = "<<m<<" mtrs & "<<c<<" cms";
    f=m/0.30;
    in=c/2.54;
    cout<<"\n Difference in Feets & Inches = "<<f<<" feets & "<<in<<" inches"; 
}
void sum(dist1 d1, dist2 d2) {
    int n1, n2, n3, ans, m, c, f, in;
    n1=d2.inch*2.54;
    n2=d2.feet*0.30;
    n3=d1.mtr*100;
    ans=((d1.cm + n3) + (n1+n2));
    m=ans/100;
    c=ans%100;
    cout<<"\n ------------------------------------------------------------------";
    cout<<"\n Sum in Meters & Centimeters = "<<m<<" mtrs & "<<c<<"cms";
    f=m/0.30;
    in=c/2.54;
    cout<<"\n Sum in Feets & Inches = "<<f<<" feets & "<<in<<" inches"; 
}
int main() {
    dist1 d1;
    dist2 d2;
    d1.accept();
    d2.accept();
    difference(d1,d2);
    sum(d1,d2);
 return 0;
}