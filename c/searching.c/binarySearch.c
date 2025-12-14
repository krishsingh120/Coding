#include<stdio.h>
  int binarysearch(int arr[],int key, int n ){
      int start=0, end=n-1;

       int mid = (start+end)/2;

      while(start<=end){

        if(arr[mid]==key) {    // found
           return mid;
        }
          else if(arr[mid]>key){     // left
            end=mid-1;
          }
          else {              // right
            start=mid+1;
          }
      }
         return -1;
  }
int main(){
   int arr[]={2,3,5,6,9};
   int n=sizeof(arr)/sizeof(int);
   int key=5;
   int index=binarysearch(arr,key,n);
     if(index==-1){
        printf(" not found");
      }
        else {
          printf("key is at index:%d",index);
        }

    return 0;

}