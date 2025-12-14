#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
} ;
    struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*new1;
   
 struct node* reverse(){

         prev=NULL;
         next=NULL;
         temp=head;
         while(temp!=NULL){
           next=temp->next;
           temp->next=prev;
           prev=temp;
           temp=next;
         }
          head=prev;
          temp=head;
 }

void insertfirst(int x){

      if(head==NULL){
        printf("list not found ");
      }
      else{
        new1=(struct node*) malloc(sizeof(struct node));
        new1->data=x;
        new1->next=head;
        head = new1;
      }
}

void insertlast(int x){

        struct node*new2;
        new2=(struct node*) malloc(sizeof(struct node));
        new2->data=x;
        new2->next=NULL;
       
      if(head==NULL){
        printf("list not found ");
      }
      else{
         temp=head;
        while(temp->next!=NULL){
          temp=temp->next;
        }
        temp->next=new2;

      }
}


 
void create(int x){
  
    struct node*new=(struct node*) malloc(sizeof(struct node));
       new->data=x;
       new->next=NULL;

    if(head==NULL){
     
     head = new;
     temp=new;

    }

    else {
        temp->next=new;
        temp=new;
    }

}

void printLL(){
          temp=head;
      while (temp!=NULL){

        printf("%3d",temp->data);
          temp=temp->next;
      }
}

int main(){
    
    create(1);
    create(2);
    create(3);
    create(4);
    create(5);
    create(6);
   
    printLL();

    insertfirst(0);
      printf("\n");
      printLL();

    insertlast(7);
      printf("\n");
      printLL();


    // reverse();
    
    // printf("\n");
    //  printLL();
    
    return 0;
}