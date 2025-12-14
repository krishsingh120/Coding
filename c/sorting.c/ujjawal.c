#include <stdio.h>
void main(){
    int arr[]={2,8,3,1,5,7};
    int n=sizeof(arr)/sizeof(int);
    int i,j,temp,min;
    // selection sort
    for(i=0;i<n-1;i++){
        min = i;
        for(j=i;j<n;j++){
            if(arr[j]<arr[min]){
            min = j;
       }
    }   
        temp = arr[i];
        arr[i]=arr[min];
        arr[min] = temp;
    }   
    // print sorted array
       for(i=0;i<n;i++){
        printf("%3d",arr[i]);
  }
}