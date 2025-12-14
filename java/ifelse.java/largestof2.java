import java.util.*;
public class largestof2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A>=B){
            System.out.println("A is largest of two:  "+A);
        }
         else {
             System.out.println("B is largest of two: "+B);
        }
    }
}
