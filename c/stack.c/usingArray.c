#include<stdio.h>
#include<string.h>
#include<conio.h>
#define N 5
int stack[N];
int top=-1;
   // push operation
void push(){
    int x;
    printf("enter element:");
    scanf("%d",&x);
    if(top==N-1){
   printf("stack overflow");
    }
    else {
        top++;
        stack[top]=x;  
    }
}
    // pop operation
   void pop(){
     int item;
     if(top==-1){
        printf("stack underflow");
     }
     else {
        item=stack[top];
        top--;
        printf("%d",item);
     }
   }
    // peek operation
    void peek(){
        if(top==-1){
            printf("stack underflow");
        }
        else{
            printf("%d",stack[top]);
        }
    }
     // display operation
     void display(){
        int i;
        for(i=top; i>=0; i--){
            printf("%3d",stack[i]);
        }
     }
void main(){
   int choice;
   do{
    printf("\nenter choice:");
    scanf( "%d",&choice);
    switch (choice) {
        case 1: push(); break;
        case 2: pop(); break;
        case 3: peek(); break;
        case 4: display(); break;
        default : printf("\ninvalid choice");  
    }
   } while(choice!=0);
}
 