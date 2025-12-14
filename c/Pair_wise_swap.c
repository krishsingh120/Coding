
#include <stdio.h>
#include <stdlib.h>


struct Node {
	int data;
	struct Node* next;
};


void swap(int* a, int* b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}


void pairWiseSwap(struct Node* head)
{
	struct Node* temp = head;

	
	
}


void push(struct Node** head, int data)
{
	struct Node* new = (struct Node*)malloc(sizeof(struct Node));

	new->data = data;

	new->next = (*head);

	(*head) = new;
}

void printList(struct Node* temp)
{
	while (temp != NULL) {
		printf("%d ", temp->data);
		temp = temp->next;
	}
}

int main()
{
	struct Node* start = NULL;

	push(&start,6);
	push(&start, 5);
	push(&start, 4);
	push(&start, 3);
	push(&start, 2);
	push(&start, 1);

	
	printList(start);

	pairWiseSwap(start);
    printf("\n");

	

	return 0;
}
