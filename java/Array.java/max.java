import java.util.*;
public class max {
    public static void getlargest(int arr[]){
        int maxNum=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxNum){
               maxNum=arr[i];
            } 
       }     
       System.out.print("largest number is: "+maxNum);
  }
  public static void main(String args[]){
     int arr[]={4,1,3,8,6,2};
        getlargest(arr);
   
  }
}
