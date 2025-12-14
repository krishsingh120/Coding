import java.util.*;
public class reverse {
    public static void reversearray(int arr[]){
        for(int i=0,j=arr.length-1; i<j; i++,j--){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
        }
          for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
          }
    }
    public static void main(String args[]){
        int arr[]={4,1,3,8,6,2};
         reversearray(arr);
    }
            
}
