import java.util.*;
public class create {
    public static void main(String args[]){
        // create
        int arr[]=new int[5];    // jab input lena ho to ese declair krte hai
        int a[] = {3,5,4};       // size of array=3

        System.out.println(arr.length);

        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of array:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
           
        }
        System.out.print("print array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
