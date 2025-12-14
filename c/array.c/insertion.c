#include<stdio.h>
int main(){
    int size=6;
    int arr[10]={4,5,3,8,0,1};
    int value=7;
    int pos=3;
      printf("array : ");
       for(int i=0;i<size;i++){
        printf("%4d",arr[i]);
    }
        printf("\n");
   if(pos<0 || pos>size){
        printf("invalid position");
    }
      for(int i=size-1;i>=pos;i--){
        arr[i+1]=arr[i];
      }   
        arr[pos]=value;
        size++;
        printf("array after insertion :");
           for(int i=0;i<size;i++){
             printf("%3d",arr[i]);
          }
            printf("\n size of array is:%d",size);
    return 0;
}