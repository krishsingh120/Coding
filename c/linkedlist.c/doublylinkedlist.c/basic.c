#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node*add;
    struct node*prev;
} ;
   struct node*node1,*next,*start,*temp,*new1,*new2,*new3,*pre;
   struct node*node2;
   struct node*node3;
   struct node*node4;
   struct node*node5;
int main(){

   node1=(struct node*) malloc(sizeof(struct node));
   node2=(struct node*) malloc(sizeof(struct node));
   node3=(struct node*) malloc(sizeof(struct node));
   node4=(struct node*) malloc(sizeof(struct node));
    node1->prev=NULL;
    node1->data=10;
    node1->add=node2;
    
    node2->prev=node1;
    node2->data=20;
    node2->add=node3;
     
    node3->prev=node2;
    node3->data=30;
    node3->add=node4;
    
    node4->prev=node3;
    node4->data=40;
    node4->add=NULL;
      temp = node1;
    printf("The elements are:");
      while(temp!=NULL){
      printf("%5d",temp->data);
       temp=temp->add;  // move forward
    }        
      // insertion first

    new1=(struct node*) malloc(sizeof(struct node));
    new1->prev=NULL;
    new1->data=5;
    new1->add=node1;
    temp=new1;
    printf("\nelements after insertion first:");
      while(temp!=NULL){
      printf("%5d",temp->data);
       temp=temp->add;
      }
     // insertion last

    new2=(struct node*) malloc(sizeof(struct node));
    node4->add=new2;
    new2->data=50;
    new2->add=NULL;
    temp=node1;
    printf("\nelements after insertion last:");
      while(temp!=NULL){
      printf("%5d",temp->data);
       temp=temp->add;
      }
     // insertion middle
         int pos,count=0,i=1;
        //  printf("\nenter position:");
        //  scanf("%d",&pos);
        if(node1==NULL){
         printf("invalid list:");
       }
       else {
       temp=node1;
       while(temp!=NULL){
          count++;
        temp=temp->add;
      }  
       printf("\nnumber of node is: %d",count);
        printf("\nenter position:");
         scanf("%d",&pos);
    new3=(struct node*) malloc(sizeof(struct node));
      pre=NULL;
      next=node1;
      while(i<pos){
       pre=next;
       next=next->add;
       i++;
    }
     new3->add=next;
     new3->data=25;
     pre->add=new3;
      temp=node1;
    printf("\nelements after insertion middle:");
      while(temp!=NULL){
      printf("%5d",temp->data);
       temp=temp->add;
      }
       }
    return 0;
}
    