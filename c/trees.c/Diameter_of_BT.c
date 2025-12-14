#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<stdbool.h>
struct node{
    int data;
    struct node*left,*right;
} ;
struct node*root=NULL,*newnode,*p,*p1,*p2,*p3,*p4,*p5,*p6;

void inorder(struct node*root){
    if(root==NULL) return;
    inorder(root->left);
    printf("%3d",root->data);
    inorder(root->right);

}

int height(struct node*root){
     if(root==NULL){
        return 0;
     }
     int leftheight = height(root->left);
     int rightheight = height(root->right);

    if (leftheight > rightheight)
        return 1 + leftheight;
    else
        return 1 + rightheight;
}

int max(int a, int b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }
}


// Function to find the diameter of a binary tree.
int diameter(struct node* root) {
    if (root == NULL)
        return 0;

    int left_height = height(root->left);
    int right_height = height(root->right);

    int op1 = diameter(root->left);
    int op2 = diameter(root->right);
    
//     return max(left_height + right_height + 1, max(left_diameter, right_diameter));
       int op3 = height(root->left) + height(root->right) + 1;

    return max(op3, max(op1, op2));

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
   p5=create(2);
   p6=create(8);

   // Finally The tree looks like this:
    //      5
    //     / \
    //    3   6
    //   / \  / \
    //  1   4 2  8
    

    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;

    p2->left=p5;
    p2->right=p6;
    
    
     printf("\ninorder is:");
     inorder(p);

      printf("\n");    
    int treediameter = diameter(p);
    printf("diameter of the binary tree: %d\n", treediameter);


    return 0;
}