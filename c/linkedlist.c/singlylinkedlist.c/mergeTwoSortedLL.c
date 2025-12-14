
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
} ;
    struct node*head1=NULL,*head2=NULL,*prev,*next,*temp1,*slow,*fast,*p1,*p2,*temp2,*temp;
     struct node *head;
   

 struct node* merge(){
      head=(struct node*)malloc(sizeof(struct node));
      head->data=100;
      head->next=NULL;
      
      temp1=head1;
      temp2=head2;
      temp=head;

      while(temp1!=NULL && temp2!=NULL){
         if(temp1->data < temp2->data){
            temp->next=temp1;
            temp=temp1;
            temp1=temp1->next;
         }

         else{
            temp->next=temp2;
            temp==temp2;
            temp2=temp->next;

         }
      }
         
         if(temp1==NULL)  temp->next=temp2;

         else temp->next=temp1;
         return head->next;
 }
 

 void create1(int x){
    struct node *temp1;
    struct node*new=(struct node*) malloc(sizeof(struct node));
       new->data=x;
       new->next=NULL;

    if(head1==NULL){
     
     head1 = new;
     temp1=new;

    }

    else {
        temp1->next=new;
        temp1=new;
    }

}

 void create2(int x){
    struct node *temp2;
    struct node*new=(struct node*) malloc(sizeof(struct node));
       new->data=x;
       new->next=NULL;

    if(head2==NULL){
     
     head2 = new;
     temp2=new;

    }

    else {
        temp2->next=new;
        temp2=new;
    }

}


void printLL1(){
    struct node*temp1=head1;
      while (temp1!=NULL){

        printf("%3d",temp1->data);
          temp1=temp1->next;
      }
}

void printLL2(){
    struct node*temp2=head2;
      while (temp2!=NULL){

        printf("%3d",temp2->data);
          temp2=temp2->next;
      }
}

 void printLL(){
    struct node*temp=head->next;
      while (temp!=NULL){

        printf("%3d",temp->data);
          temp=temp->next;
      }
 }  
      
      int main(){
    
   create1(1);
   create1(3);
   create1(5);
   create1(8);
   create1(9);
   
    printLL1();
 
   create2(2);
   create2(4);
   create2(6);
   create2(7);

  printf("\n");
   printLL2();

    if(merge()==(head->next))
        printf("\nMerged Successfully");
    else
        printf("\nMerged Unsuccessfully");

    printf("\n");
    printLL();
   
    
    return 0;
}