#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
} ;
    struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*p2;
    struct node*node1,*node2,*node3,*node4,*node5;



struct node* deletenode(struct node*node){
       node->data = node->next->data;
       node->next = node->next->next;

       return node;
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
    
   node1=(struct node*) malloc(sizeof(struct node));
   node2=(struct node*) malloc(sizeof(struct node));
   node3=(struct node*) malloc(sizeof(struct node));
   node4=(struct node*) malloc(sizeof(struct node));
    node1->data=10;
    node1->next=node2;

    node2->data=20;
    node2->next=node3;

    node3->data=30;
    node3->next=node4;

    node4->data=40;
    node4->next=node5;

    node5->data=50;
    node5->next=NULL;

    printLL();

   deletenode(node4);

    printf("\n");
    
   

    return 0;
}