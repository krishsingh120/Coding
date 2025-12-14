import java.util.*;
public class largestOf3 {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     if(a>b && a>c){
        System.out.println("a is largest of 3");
     }
      else if(b>c){
        System.out.println("b is largest of 3");
      }
      else {
         System.out.println("c is largest of 3");
      }
    }
}
