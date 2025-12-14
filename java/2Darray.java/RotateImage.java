public class RotateImage {

    public static void print(int arr[][], int n){

        for(int i=0; i<n; i++){
            for(int j=0;  j<n; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
       
        
        // transpose 
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }
        // reverse transpose

        for(int i=0; i<n; i++){
            // 1-D array reverse
            int j=0;
            int k=n-1;
            while(j<k){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }
        }
         print(arr,n);
    }
}
