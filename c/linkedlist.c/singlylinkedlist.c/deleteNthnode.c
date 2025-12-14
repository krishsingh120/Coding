#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
} ;
    struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*p2;
   
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

 
void create(int x){
    struct node *temp;
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
    struct node*temp=head;
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

    reverse();
    
    printf("\n");
    printLL();
    
    return 0;
}