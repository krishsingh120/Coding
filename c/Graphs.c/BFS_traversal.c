#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<limits.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;

struct node *reverse(struct node *head) {
    struct node *prev = NULL;
    struct node *current = head;
    struct node *next = NULL;
    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    return prev; // new head of the reversed list
}

void MaxTwinSum() {
    struct node *slow = head;
    struct node *fast = head;
    while (fast->next != NULL && fast->next->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    struct node *secondHalfHead = reverse(slow->next);
    slow->next = secondHalfHead; // Update the link to the reversed second half

    struct node *p1 = head;
    struct node *p2 = secondHalfHead;

    int max = INT_MIN;

    while (p1 != NULL && p2 != NULL) {
        int sum = p1->data + p2->data;
        if (sum > max) {
            max = sum;
        }
        p1 = p1->next;
        p2 = p2->next;
    }

    printf("max twin sum is: %d\n", max);
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
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    create(1);
    create(10);
    create(13);
    create(4);
    create(5);
    create(6);
    create(7);
    create(2);

    printLL();

    MaxTwinSum();

    return 0;
}
