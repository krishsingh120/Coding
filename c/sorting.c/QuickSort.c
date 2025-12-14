#include<stdio.h>
    int partition(int arr[],int first,int last){
     int pivot=arr[last];
     int i=first-1;
     int j=first;
     int temp;
     for(j=first;j<last;j++){
      if(arr[j]<pivot){
        i++;
        // swap arr[i] and arr[j]
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
     }  
         // swap arr[i+1] and arr[last]
        temp=arr[i+1];
        arr[i+1]=arr[last];
        arr[last]=temp;
        return i+1;
    }

  void quicksort(int arr[],int first,int last){
    if(first<last) {
     int pi=partition(arr,first,last);
     quicksort(arr,first,pi-1);
     quicksort(arr,pi+1,last); 
    }
  }
int main(){
    int arr[]={5,3,8,9,1,4};
    int n=sizeof(arr)/sizeof(int);
    int first=0;
    int last=n-1;
    quicksort(arr,0,n-1);
    for(int i=0;i<n;i++){
    printf("%5d",arr[i]);
    }
    return 0;
}
           
