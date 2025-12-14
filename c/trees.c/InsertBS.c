#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*left,*right;
} ;
struct node*root=NULL,*newnode,*p,*p1,*p2,*p3,*p4;

void inorder(struct node*root){
    if(root==NULL) return;
    inorder(root->left);
    printf("%3d",root->data);
    inorder(root->right);

}

 struct node*create(int x){
   newnode=(struct node*) malloc(sizeof(struct node));
   newnode->data=x;
   newnode->left=NULL;
   newnode->right=NULL;

    return newnode;
}


 void insert(struct node *root, int key){
   struct node *prev = NULL;
   while(root!=NULL){
       prev = root;
       if(key==root->data){
           printf("Cannot insert %d, already in BST", key);
           return;
       }
       else if(key<root->data){
           root = root->left;
       }
       else{
           root = root->right;
       }
   }
   struct node* new = create(key);
   if(key<prev->data){
       prev->left = new;
   }
   else{
       prev->right = new;
   }
}


int main(){
   p=create(5);
   p1=create(3);
   p2=create(6);
   p3=create(1);
   p4=create(4);

   // Finally The tree looks like this:
    //      5
    //     / \
    //    3   6
    //   / \
    //  1   4  

    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;
    
    insert(p,7);
    printf("insert node is: %d",p->right->right->data);
      
    return 0;
}