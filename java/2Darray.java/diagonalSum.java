public class diagonalSum {
    public static int  diagonalsum(int arr[][]){
        int sum=0;
        // for(int i=0; i<arr.length; i++){     // O(n^2) time complexity
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }

          // optimize code
          for(int i=0;i<arr.length;i++){    // O(n) time complexity
            // PD
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
          }
        return sum;
    }
      public static void main(String args[]){
        int arr[][]={{1,2,3}, 
                     {4,5,6},
                     {7,8,9}};
         System.out.print(diagonalsum(arr));
      }
}
