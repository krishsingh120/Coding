#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node*add;
} ;
   struct node*rear=NULL,*front=NULL,*temp,*new;
  
   // enqueue
  void enqueue(int x){
     new=(struct node*) malloc(sizeof(struct node));
     new->data=x;
     new->add=NULL;
     if(rear==NULL && front==NULL){
        rear=front=new;
        rear->add=front;
     }
     else{
        rear->add=new;
        rear=new;
        rear->add=front;
     }
  }

   // display
  void display(){
       temp=front;
   if(rear==NULL && front==NULL){
    printf("queue is empty");
   }
    else{
        while(temp->add!=front){
         printf("%3d",temp->data);
            temp=temp->add;
        }
         printf("%3d",temp->data);
    }
  }

   // dequeue
   void dequeue(){
     temp=front;
   if(rear==NULL && front==NULL){
    printf("queue is empty");
   }
   else if(front == rear){
      front=rear=NULL;
      free(temp);
   }
    else {
        printf("%3d",front->data);
           front=front->add;
           rear->add=front; 
           free(temp);
    }
   }

    // peek 
    void peek(){
    if(rear==NULL && front==NULL){
       printf("queue is empty");
   }
    else{
      printf("top element is:%d",front->data);
    }
 }

  

int main(){
    int choice;
    
     do{
        printf("\nenter the choice:");
        scanf("%d",&choice);
       switch(choice){
        case 1:enqueue(2); break;
        case 2:enqueue(5); break;
        case 3:enqueue(6); break;
        case 4:display(); break;
        case 5:dequeue(); break;
        case 6:peek(); break;
        default: printf("invalid choice");
       }
  } while(choice!=0);
}   