#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node*add;
    struct node*prev;
} ;
   struct node*node1,*pre,*start,*temp,*next;
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
       temp=temp->add;
    }        
   // deletion first

   temp=node1;
   node1=node1->add;
   node1->prev=NULL;
   printf("\ndeleted node:%3d",temp->data);
     free(temp);
     temp=node1;
      printf("\nelements after deletion:");
      while(temp!=NULL){
      printf("%5d",temp->data);
       temp=temp->add;
    }        
    // deletion last

     temp=node1;
     while(temp->add!=NULL){
        pre=temp;
        temp=temp->add;
     }  
        pre->add=NULL;
       printf("\ndeleted node:%3d",temp->data);
              free(temp);
              temp=node1;
     printf("\nelements after deletion:");
      while(temp!=NULL){
      printf("%5d",temp->data);
       temp=temp->add;
  }
       // deletion middle

      int pos,count=0,i=1;
      printf("\nenter the position");
      scanf("%d",&pos);

       temp=node1;
       while(temp!=NULL){
          count++;
        temp=temp->add;
      }  
       printf("\nnumber of node is: %d",count);
         temp=node1;
         while(i<pos){
            pre=temp;
            temp=temp->add;
            i++;
         }
         

}