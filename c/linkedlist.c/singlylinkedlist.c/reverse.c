#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node*add;
};
   struct node*node1,*prev,*next,*start,*temp;
   struct node*node2;
   struct node*node3;
   struct node*node4;
   struct node*node5;
int main(){
     // implementation
   node1=(struct node*) malloc(sizeof(struct node));
   node2=(struct node*) malloc(sizeof(struct node));
   node3=(struct node*) malloc(sizeof(struct node));
   node4=(struct node*) malloc(sizeof(struct node));
    node1->data=10;
    node1->add=node2;

    node2->data=20;
    node2->add=node3;

    node3->data=30;
    node3->add=node4;

    node4->data=40;
    node4->add=NULL;
      temp = node1;
    printf("The elements are:");
      for(int i=0;i<4;i++){
      printf("%5d",temp->data);
         temp = temp->add;
    }
     // count
           int count=0;
           temp=node1;
         while(temp!=NULL){
             count++;
           temp=temp->add;
         }
       printf("\ntotal nodes is:%d",count);
      // reverse linkesd list
         prev=NULL;
         next=NULL;
         temp=node1;
         while(temp!=NULL){
           next=temp->add;
           temp->add=prev;
           prev=temp;
           temp=next;
         }
           node1=prev;
           temp=node1;
   printf("\nreverse of linked list:");
     while(temp!=NULL){
      printf("%5d",temp->data);
         temp = temp->add;
    }
        // search
        int s,f=0;
        printf("\nenter an element for search :");
        scanf("%d",&s);
        temp=node1;
        while(temp!=NULL){
          if(temp->data==s){
           f=1; 
           break;
          }  temp=temp->add;
       }
         
         if(f==1){
          printf("searching success");
         } 
         else {
            printf("searching not success");
         }
    return 0;
}
    