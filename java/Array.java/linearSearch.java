import java.util.*;
public class linearSearch {
    public static int search(int arr[],int key){
          for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
          }
          return -1;
    }
    public static void main(String args[]){
       int arr[]={4,1,3,8,6,9,0,2};
       int key=0;
       int index=search(arr,key);
      if(index==-1){
        System.out.print("element is not present in array");
      }
      else {
        System.out.print("index is :"+index);
      }
    }
}
