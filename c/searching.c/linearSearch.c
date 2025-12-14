#include<stdio.h>
 int search(int arr[],int key,int n){
      for(int i=0; i<n; i++){
        if(arr[i]==key) return i;
      }
         return -1;
 }
int main(){
    int arr[]={2,6,4,3,8,9,0,1,5,7};
    int n=sizeof(arr)/sizeof(int);
    int key=7;
    int index=search(arr,key,n);
     if(index==-1){
        printf(" not found");
     }
      else {
        printf("key is at index:%d",index);
      }
}