#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<conio.h>
struct node{
    int data;
    struct node*add
} ;
   struct node*start=NULL;
   struct node*temp;
   struct node*new1;
   struct node*prev;
   struct node*next;
   struct node*arr[50];
   
int main(){
    int choice;
    
        // printf("\n---------linked list menu----------");
        // printf("\n1.create");
        // printf("\n4.display");
        // printf("\n2.insert_first");
        // printf("\n3.delete");
        // printf("\n5.exit");
        // printf("\n---------------------------------------");
     do{
        printf("\nenter the choice:");
        scanf("%d",&choice);
       switch(choice){
        case 1:create(); break;
        case 2:display(); break;
        case 3:insert_first(); break;
        case 4:insert_last(); break;
        case 5:insert_middle(); break;
        case 6:delete_first(); break;
         case 7:delete_last(); break;
         case 8:reverse(); break;
         case 9:middle_of_linkedlist(); break;
        default: printf("invalid choice");
       }
  } while(choice=7);
}   
      // create
   int create(){
    int n;
    char ch;
    printf("\nenter the data:");
    scanf("%d",&n);
    start=(struct node*) malloc(sizeof(struct node));
    start->data=n;
    start->add=NULL;
    temp=start;
     printf("\nwant to continue:");
      ch=getche();
     while(ch=='y' || ch=='Y'){
       printf("\nenter next element:");
       scanf("%d",&n);
      new1=(struct node*) malloc(sizeof(struct node));
      new1->data=n;
      new1->add=NULL;
      temp->add=new1;
      temp=temp->add;
      printf("\nwant to continue:");
      ch=getche();
     }
   }

  //  display
   int display(){
     if(start==NULL){
      printf("\nlist not found:");
     }
      else{
        temp=start;
        while(temp!=NULL){
          printf("\t%d",temp->data);
          temp=temp->add;
        }
      }
    }
      // insert first
     int insert_first(){
        int n;

        if(start==NULL){
          printf("\nlist not found");
        }
         else 
         {
           printf("enter new element for insert:");
           scanf("%d",&n);
           new1=(struct node*) malloc(sizeof(struct node));
             new1->data=n;
             new1->add=NULL;
             new1->add=start;
             start=new1;
         }
      }
         // insert last
        int  insert_last(){
             int n;
          
        if(start==NULL){
          printf("\nlist not found");
        }
         else 
         {
           printf("enter new element for insert:");
           scanf("%d",&n);
           new1=(struct node*) malloc(sizeof(struct node));
             new1->data=n;
             new1->add=NULL;
             temp=start;
             while(temp !=NULL){
              temp=temp->add;
              temp->add=new1;
             }   
          }
      }
      // insert middle
      int insert_middle(){
            int n,pos,i=1;
          
        if(start==NULL){
          printf("\nlist not found");
        }
         else 
         {
           printf("enter new element for insert:");
           scanf("%d",&n);
           new1=(struct node*) malloc(sizeof(struct node));
             new1->data=n;
             new1->add=NULL;
             printf("enter the position:");
             scanf("%d",&pos);
             next=start;
             while(i<pos){
              prev=next;
              next=next->add;
              i++;
             }
             prev->add=new1;
             new1->add=next;
       }
    }
         // delete first
       int delete_first(){
          if(start==NULL)
          printf("list not found");
          else{
            temp=start;
            start=start->add;
            printf("deleted node is:%d",temp->data);
            free(temp);
          }
         }
            // delete last
            int delete_last(){
              if(start==NULL)
              printf("list not found");
              else{
                temp=start;
                while(temp!=NULL){
                  prev=temp;
                  temp=temp->add;
                }
                 prev->add=NULL;
                 printf("deleted node is:%d",temp->data);
                 free(temp);
              }
             }
             // reverse linked list
            int reverse(){
         
               prev=NULL;
               next=NULL;
               temp=start;
               while(temp!=NULL){
                next=temp->add;
                temp->add=prev;
                prev=temp;
                temp=next;
               }
               start=temp;
               temp=start;
                 while (temp != NULL) {
               printf("%d ", temp->data);
                 temp = temp->add;
    }
        }
            // middle of linked list
           int middle_of_linkedlist(){
              
              int count=0;
              temp=start;
              while(temp!=NULL){
                count++;
                temp=temp->add;
              }
                printf("\ntotal nodes is:%d",count);
                int mid=count/2;
                 printf("\nmiddle:%d",mid);
                // reverse
                int i;
             if(start==NULL)
             printf("list not found");
             else {
              temp=start;
              i=0;
             while(temp!=NULL){
              arr[i]=temp;
               temp=temp->add;
               i++;
             } 
             i--;
              printf("\nreverse linked list is:");
              while(i>=mid){
                printf("%5d",arr[i]->data);
                i--;
              }
           }  
            }