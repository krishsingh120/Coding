#include<stdio.h>
   // input  0 5 0 3 4 2
   // output 5 3 4 2 0 0
void moveZeros(int arr[],int n){
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-1-i; j++){
            if(arr[j]==0 && arr[j+1]!=0){
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
     int n=6;
    // printf("enter the length of array:");
    //  scanf("%d",&n);
    int arr[]={0,5,0,3,4,2};
    moveZeros(arr,n);
     printArr(arr,n);
       return 0;
}