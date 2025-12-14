#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h.>
int main(){
//   int  x=sizeof(bool);
//   printf("%d",x);
 int* ptr=(int*) calloc(24,sizeof(int));
 ptr++;
    printf("%d",*ptr);
    return 0;
}