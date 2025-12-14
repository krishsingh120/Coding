#include<stdio.h>
void bubblesort(int arr[],int n){
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }   
 }
   int printArr(int arr[], int n){
        for(int i=0; i<n; i++){
            printf("%d ",arr[i]);
        }
      }
int main(){
    int arr[]={2,6,3,1,5,7};
    int n=sizeof(arr)/sizeof(int);
    printArr(arr,n);
    
    bubblesort(arr,n);
    printf("\n");

    printArr(arr,n);
       return 0;
}