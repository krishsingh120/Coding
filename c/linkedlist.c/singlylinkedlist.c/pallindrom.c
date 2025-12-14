// #include<stdio.h>
// #include<stdlib.h>
// #include<conio.h>
// #include<stdbool.h>
// struct node{
//     int data;
//     struct node*next;
// } ;
//     struct node*head=NULL,*prev,*next,*temp,*slow,*fast,*p1,*p2;
   
//  struct node* reverse(){
//          prev=NULL;
//          next=NULL;
//          temp=head;
//          while(temp!=NULL){
//            next=temp->next;
//            temp->next=prev;
//            prev=temp;
//            temp=next;
//          }
//          head = prev; // Update the head pointer
//     return head; // Return the new head of the reversed list
          
//  }

//  bool palindrome(){
//       slow=fast=head;
//       while(fast->next!=NULL && fast->next->next!=NULL){

//         slow=slow->next;
//         fast=fast->next->next;
//       }

//          temp = reverse(slow->next);

//          slow->next=temp;
         
//          p1=head;
//          p2=temp;

//          while(p1 != NULL && p2 != NULL) {
//             if(p1->data!=p2->data)
//               return false;

//               p1=p1->next;
//               p2=p2->next;
//          }
//          return true;
//  }

 
// void create(int x){
//     struct node *temp;
//     struct node*new=(struct node*) malloc(sizeof(struct node));
//        new->data=x;
//        new->next=NULL;

//     if(head==NULL){
     
//      head = new;
//      temp=new;

//     }

//     else {
//         temp->next=new;
//         temp=new;
//     }

// }

// void printLL(){
//     struct node*temp=head;
//       while (temp!=NULL){

//         printf("%3d",temp->data);
//           temp=temp->next;
//       }
// }

// int main(){
    
//     create(1);
//     create(2);
//     create(3);
//     create(2);
//     create(2);
//     create(1);
   
//     printLL();

//     reverse();
    
//     printf("\n");
    
//     if(palindrome()==true){
//        printf("linked list is palindrome");

//    }
//     else {
//        printf("linked list is not palindrome");
//     }

//     return 0;
// }




#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;

struct node* reverse() {
    struct node *prev = NULL;
    struct node *current = head;
    struct node *next = NULL;
    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    head = prev; // Update the head pointer
    return head; // Return the new head of the reversed list
}

bool palindrome() {
    struct node *slow = head;
    struct node *fast = head;
    while (fast->next != NULL && fast->next->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    struct node *secondHalfHead = reverse(slow->next); // Reverse the second half
    slow->next = secondHalfHead; // Update the link from first half to reversed second half

    struct node *p1 = head;
    struct node *p2 = secondHalfHead;

    while (p1 != NULL && p2 != NULL) {
        if (p1->data != p2->data)
            return false;
        p1 = p1->next;
        p2 = p2->next;
    }
    return true;
}

void create(int x) {
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = x;
    newNode->next = NULL;

    if (head == NULL) {
        head = newNode;
    } else {
        struct node *temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
}

void printLL() {
    struct node *temp = head;
    while (temp != NULL) {
        printf("%3d", temp->data);
        temp = temp->next;
    }
}

int main() {
    create(1);
    create(2);
    create(3);
    create(2);
    create(2);
    create(1);

    printLL();

    printf("\n");

    if (palindrome()==true) {
        printf("Linked list is palindrome\n");
    } else {
        printf("Linked list is not palindrome\n");
    }

    return 0;
}
