#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
} ;
    struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*p2,*newhead;
   
 struct node* reverse(){

        if(head==NULL) return head;
        newhead=reverse(head->next);
        head->next->next=head;
        head->next=NULL;

        return newhead;
          
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
    create(10);
    create(13);
    create(4);
    create(5);
    create(6);
    create(7);
    create(2);
   
   
    printLL();

   if(reverse()==newhead){
      printf("reverse successfull");
      printLL();
   }
    else {
        printf("list not create");
    }


    return 0;
}