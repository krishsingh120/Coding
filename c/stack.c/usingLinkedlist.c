#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node*add;
} ;
   struct node*top=NULL,*new,*temp;
  
   // push
   void push(int x){
    new=(struct node*) malloc(sizeof(struct node));
     new->data=x;
     new->add=top;
     top=new;
   }

   // display
  void display(){
   temp=top;
   if(top==NULL){
    printf("stack is underflow");
   }
    else{
        while(temp!=NULL){
            printf("%3d",temp->data);
            temp=temp->add;
        }
    }
  }

    // peek 
    void peek(){
         if(top==NULL){
    printf("stack is underflow");
   }
    else{
      printf("top element is:%d",top->data);
    }
 }

     // pop
     void pop(){
       temp=top;
     if(top==NULL){
    printf("stack is underflow");
   } 
     else{
      printf("%d",top->data);
       top=top->add;
       free(temp);
    }
     }

int main(){
    int choice;
    
     do{
        printf("\nenter the choice:");
        scanf("%d",&choice);
       switch(choice){
        case 1:push(2); break;
        case 2:push(5); break;
        case 3:push(6); break;
        case 4:display(); break;
        case 5:peek(); break;
        case 6:pop(); break;
        case 7:peek(); break;
        case 8:display(); break;
        default: printf("invalid choice");
       }
  } while(choice!=0);
}  