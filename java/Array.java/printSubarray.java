import java.util.*;
public class printSubarray {
    public static void subarray(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length; i++){    //  find starting index

            for(int j=i; j<arr.length; j++){  // find ending index

              for(int k=i; k<=j; k++){    // print subarray

                System.out.print(" "+arr[k]);
              }
                 ts++;
             System.out.println();
            }  
            System.out.println();
        }
        System.out.println("total subarray :"+ts);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subarray(arr);
    }
}
