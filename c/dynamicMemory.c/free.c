#include<stdio.h>
#include<stdlib.h>
int main(){
    int* ptr=(int*) malloc(10*sizeof(int));
    int* p=ptr;
    p++;
    // free(ptr);
    return 0;
}