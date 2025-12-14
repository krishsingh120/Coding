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

void postorder(struct node*root){
    if(root==NULL) return;
    postorder(root->left);
    postorder(root->right);
    printf("%3d",root->data);
}

void preorder(struct node*root){
    if(root==NULL) return;
    printf("%3d",root->data);
    preorder(root->left);
    preorder(root->right);
}

struct node*create(int x){
   newnode=(struct node*) malloc(sizeof(struct node));
   newnode->data=x;
   newnode->left=NULL;
   newnode->right=NULL;

    return newnode;
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
    
    printf("\npreorder is:");
    preorder(p);

    printf("\npostorder is:");
    postorder(p);

     printf("\ninorder is:");
     inorder(p);

    return 0;
}


//  Function to create a new node
// struct Node* newNode(int data) {
//     struct Node* node = (struct Node*)malloc(sizeof(struct Node));
//     node->data = data;
//     node->left = NULL;
//     node->right = NULL;
//     return node;
// }