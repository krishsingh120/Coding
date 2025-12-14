#include <stdio.h>

int main(){
    int arr[4][4]={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
    
    int maxc = -1;
    int maxi = -1;
    
    for (int  i = 0; i < 4; i++)
    {
        int count = 0;
        for (int j = 0; j < 4; j++)
        {
            if(arr[i][j]==1)
            {
                count++;
            }
        }
        
        if(count > maxc)
        {
            maxc = count;
            maxi = i;
        }
    }
    
    printf("no of 1: %d\n", maxc);
    printf("Row index  %d\n", maxi);
    
    return 0;
}