#include <stdio.h>
#include <stdlib.h>
typedef struct node{
    int data;
    struct node *next;
}node;
node *create(node *head){
   node *ptr,*temp,*temp1;
   head = NULL;
   int choice = 0;
   int n;
   printf("How many nodes you want to create\n");
   scanf("%d",&n);
   while(choice!=n){
       ptr = (node*)malloc(sizeof(node));
       printf("enter element\n");
       scanf("%d",&ptr->data);
       ptr->next = NULL;
       if(head==NULL){
           head = ptr;
           temp = ptr;
       }
       else{
           temp->next = ptr;
           temp = ptr;
       }
       choice++;
       
   }
    temp = head;
   while(temp!=NULL){
       printf("%d ",temp->data);
       temp = temp->next;
   }
   printf("\n");
   return head;
}
int main(){
    node* head = create(head);

}