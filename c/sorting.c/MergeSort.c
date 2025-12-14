#include<stdio.h>
   // merge two subarray
 int merge(int arr[], int l, int mid, int r){

   int n1=mid-l+1;
   int n2=r-mid;
   int left[n1],right[n2];
   int i,j,k;
   for(i=0; i<n1; i++) 
    left[i]=arr[l+i];
    for(j=0; j<n2; j++)
     right[j]=arr[mid+1+j];
    i=0;
    j=0;
    k=l;
    while(i<n1 && j<n2){
        if(left[i]<right[j]){
            arr[k++]=left[i++];
        }
        else 
             arr[k++]=right[j++];
    }
       while(i<n1){
           arr[k++]=left[i++];
       }
         while(i<n1){
            arr[k++]=right[j++]; 
           }
           
 }
 void mergesort(int arr[], int l, int r){
     if(l<r)  {
      int mid=(l+r)/2;
      // sort first & second halves
       mergesort(arr, l, mid);
       mergesort(arr, mid + 1, r);
       merge(arr,l,mid,r);
     } 
}

int main(){
    int arr[]={2,6,3,1,5,7};
    int n = sizeof(arr) / sizeof(int);
    int l=0,r=n-1;
    mergesort(arr,0,n-1);
    for(int i=0;i<n;i++){
      printf("%5d",arr[i]);
    }
    return 0;
}