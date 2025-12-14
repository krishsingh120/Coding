#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<stdbool.h>
#define N 5
char stack[N];
int top=-1;
// push operation
void push(char ch){
    if(top==N-1){
        printf("stack overflow");
    }
    else {
        top++;
        stack[top]=ch;
    }
}
// pop operation
void pop(){
    char item;
    if(top==-1){
        printf("stack underflow");
    }
    else {
        item=stack[top];
        top--;

    }
}
// peek operation
int peek(){
    char ch;
    if(top==-1){
        printf("stack underflow");
    }
    else{
        ch = stack[top];
        return ch;
    }
    return 0;
}
// display operation
void display(){
    int i;
    for(i=top; i>=0; i--){

    }
}

bool isbalance(char str[]){
    // size of string
    int n = strlen(str);
     printf("%d\n",n);
      int size=n;
      if(size%2!=0) 
      return false;


      int i;
    for(i=0; i<n; i++){
        char ch = str[i];
        if(ch=='('){
            push(ch);
        }
        else { // ch==')'
            if(top==-1){
                return false ;
            }
            if(peek()=='('){
                pop();
            }
        }
    }
    if(top>-1) return false;
    return true;

}

int main(){
    char str[]="(())(()";
    if(isbalance(str)==true){
        printf("bracket is balance");
    }
    else {
        printf("bracket is not balance");
    }
    return 0;
}
