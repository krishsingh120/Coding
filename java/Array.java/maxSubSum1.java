public class maxSubSum1 {
    public static void maxSum(int arr[]){
        // int currSum=0;
        int  maxsum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int currSum=0;
            for(int j=i; j<arr.length; j++){
                currSum += arr[j];
            //   for(int k=i; k<=j; k++){   
            //    // subarray sum
            //    currSum += arr[k];
            //   }
              System.out.print( " "+currSum);
                if(maxsum<currSum){
                    maxsum=currSum;
                }
            }  
        }
         System.out.println();
        System.out.print("max sum = "+ maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxSum(arr);
    }
}
