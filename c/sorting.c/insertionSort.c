#include<stdio.h>
void insertionsort(int arr[],int n){
    for(int i=1; i<n; i++){
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
        // swap arr[j],arr[j-1]
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }   
    // print sorted array
   int printArr(int arr[], int n){
        for(int i=0; i<n; i++){
            printf("%d ",arr[i]);
        }
      }
int main(){
     int n;
    printf("enter the length of array:");
     scanf("%d",&n);
    int arr[]={2,6,3,1,5,7};
    insertionsort(arr,n);
     printArr(arr,n);
       return 0;
}