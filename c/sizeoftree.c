#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*next;
} ;
struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*p2;

struct node*nthnode(int N){
    slow=head;
    fast=head;

    for(int i=1; i<=N; i++){
        fast=fast->next;
    }
    while(fast!=NULL){
        slow=slow->next;
        fast=fast->next;
    }
    return slow;
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
    create(7);
    create(8);

    printLL();


    printf("\n");
//    printLL();

  int N = 2;
    struct node *result = nthnode(N);
    if (result != NULL) {
        printf("Nth node from the end: %d\n", result->data);
    }
    return 0;
}