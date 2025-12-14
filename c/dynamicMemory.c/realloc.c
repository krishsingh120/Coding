#include<stdio.h>
#include<stdlib.h>
int main(){
    int* ptr=(int*) malloc(10*sizeof(int));
    printf("%p\n",ptr);
      ptr=(int*) realloc(ptr,20*sizeof(int));
    printf("%p",ptr);
    return 0;
}