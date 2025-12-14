#include<stdio.h>
#include<string.h>
#include<conio.h>
#include<stdbool.h>
#define N 6
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
//        printf("%c",item);
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
//        printf("%3c",stack[i]);
    }
}

int minbracketneed(char str[]) {
    // size of string
    int n = strlen(str);
    int count = 0;

    int i;
    for (i = 0; i < n; i++) {
        char ch = str[i];
        if (ch == '(') {
            push(ch);
        } else if (ch == ')') {
            if (top == -1) {
                // If encountered ')' without corresponding '('
                count++;
            } else if (peek() == '(') {
                pop();
            }
        }
    }
    
    // After processing the entire string, remaining '(' brackets are redundant
    count += (top + 1);

    return count;
}



int main(){
    char str[]="(())(())";
    
    int result=minbracketneed(str);
        printf("%d",result);
    return 0;
}

