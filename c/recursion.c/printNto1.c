#include <stdio.h>
  void decreasing(int n){
  if(n==0) return;
    printf("%3d",n);
    decreasing(n-1);
       return ;
  }
   int main(){
     int n;
       printf("enter the number :");
       scanf("%d",&n);
        decreasing(n);
      return 0;
}