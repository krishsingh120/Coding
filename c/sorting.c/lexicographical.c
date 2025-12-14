#include <stdio.h>
#include <string.h>
  // lexicographical using selection sort 
void selectionSort(char arr[][100], int n) {
    int i, j, min_index;

    for (i = 0; i < n-1; i++) {
         min_index = i;
        for (j = i+1; j < n; j++) {
            if (strcmp(arr[j], arr[min_index]) < 0) {
                min_index = j;
            }
        }    
           // swap arr[i],arr[min_index]
          if (min_index != i) {
            int temp=*arr[i];
            *arr[i]=*arr[min_index];
            *arr[min_index]=temp;
        }
    }
}

int main() {
    int n;
    printf("Enter the number of strings: ");
    scanf("%d", &n);

    char arr[n][100];
    // Input: Array of strings
    printf("Enter the strings:\n");
    for (int i = 0; i < n; i++) {
        scanf("%s", arr[i]);
    }
    selectionSort(arr, n);
    // Output: Sorted array
    printf("Sorted array in lexicographical order:\n");
    for (int i = 0; i < n; i++) {
        printf("%s\n", arr[i]);
    }

    return 0;
}
