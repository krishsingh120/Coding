#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
#include<limits.h>
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

int findmax(struct node* root) {
    // Base case: If the tree is empty, return a very small value
    if (root == NULL) return INT_MIN;
    
    int max = root->data;
    int leftMax = findmax(root->left); // Recursively find max in left subtree
    int rightMax = findmax(root->right); // Recursively find max in right subtree
    
    // Compare max value in left subtree with max value in right subtree
    if (leftMax > max) max = leftMax;
    if (rightMax > max) max = rightMax;
    
    return max;
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
     int maxvalue = findmax(p);
    printf("Maximum value in the tree: %d\n", maxvalue);
    return 0;
}