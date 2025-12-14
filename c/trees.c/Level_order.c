#include <stdio.h>
#include <stdlib.h>

// Structure for a binary tree node
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Function to create a new binary tree node
struct Node* newNode(int data) {
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
    temp->data = data;
    temp->left = temp->right = NULL;
    return temp;
}

// Optimized level order traversal using a single queue
void levelOrderTraversal(struct Node* root) {
    if (root == NULL) {
        return;
    }

    struct Node* queue[100];  // Adjust queue size based on expected tree size
    int front = 0, rear = -1;  // Initialize queue indices

    // Enqueue the root node
    queue[++rear] = root;

    while (front <= rear) {
        // Dequeue a node, print its data, and enqueue its children
        struct Node* current = queue[front++];

        printf("%d ", current->data);

        if (current->left != NULL) {
            queue[++rear] = current->left;
        }
        if (current->right != NULL) {
            queue[++rear]  = current->right;
        }
    }
}

int main() {
    struct Node* root = newNode(1);
    root->left = newNode(2);
    root->right = newNode(3);
    root->left->left = newNode(4);
    root->left->right = newNode(5);

    printf("Level Order Traversal: ");
    levelOrderTraversal(root);

    return 0;
}
