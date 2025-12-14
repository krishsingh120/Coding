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


int isBST(struct node*root){
    static struct node*prev=NULL;
    if(root!=NULL){
        if(!isBST(root->left)){
            return 0;
        }
        if(prev!=NULL && root->data <= prev->data){
            return 0;
        }
        prev=root;
        return isBST(root->right);
    }
    else{
         return 1;
    }
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
    

    printf("\ninorder is:");
    inorder(p);

    printf("\n");
    // printf("%d",isBST(p));

    if(isBST(p)){
        printf("this is a BST ");
    }
     else {
        printf("this is not a BST ");
     }
    return 0;
}