#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
#include<limits.h>
struct node{
    int data;
    struct node*next;
} ;
    struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*p2,*temp1;


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
         return prev;
          
 }

 void MaxTwinSum(){
      slow=fast=head;
      while(fast->next!=NULL && fast->next->next!=NULL){
          slow=slow->next;
          fast=fast->next->next;
      }
         temp = reverse(slow->next); 
         slow->next=temp;
         
         p1=head;
         p2=slow->next;
        
        int sum;
        int max=INT_MIN;

         while(p1 != NULL && p2 != NULL) {
          sum=(p1->data)+(p2->data);
            if(sum>max){
              max=sum;
            }
             p1=p1->next;
             p2=p2->next;
        
     }
          printf("max twin sum is :%d",max);
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
   
    printf("\n");
    
    MaxTwinSum();

    return 0;
}