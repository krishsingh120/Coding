#include<stdio.h>
#include<string.h>
#include<conio.h>
#define N 5
int queue[N];
int rear=-1;
int front=-1;

    // enqueue
 void enqueue(int x){
    if(rear==N-1){
      printf("queue is overflow");
    }
    else if(rear==-1 && front==-1){
        rear=front=0;
        queue[rear]=x;
    }
     else if(((rear+1)%N)==front){
         printf("queue is full");
     }
     else {
        rear=(rear+1)%N;
        queue[rear]=x;
     }
   }

   // dequeue
   void dequeue(){
    if(rear==-1 && front==-1){
        printf("queue is underflow");
    }
     else if(rear==front){
        rear=front=-1;
     }
      else { 
        printf("%d",queue[front]);
        front=(front+1)%N;
      }
   }

   // display
   void display(){
      int i;
      if(rear==-1 && front==-1){
         printf("queue is empty");
      }
      else {
         for(i=front; i<=rear; i++){
            printf("%3d",queue[i]);
         }
      }
   }

   // peek
   void peek(){
       if(rear==-1 && front==-1){
         printf("queue is empty");
      }
      else {
         printf("the data of front is :%d",queue[front]);
      }
   }

void main(){
   int choice;
   do{
    printf("\nenter choice:");
    scanf( "%d",&choice);
    switch (choice) {
        case 1: enqueue(2); break;
        case 2: enqueue(5); break;
        case 3: enqueue(-3); break;
        case 4: display(); break;
        case 5: peek(); break;
        case 6: dequeue(); break;
        case 7: peek(); break;
        case 8: display(); break;
        default : printf("\ninvalid choice");  
    }
   } while(choice!=0);
}
