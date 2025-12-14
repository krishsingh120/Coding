import java.util.*;
public class print1Ton {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      System.out.print("enter number:");
        int n = sc.nextInt();
        int count = 1;         
        while(count<=n){      
        System.out.print(" " +count);
          count++;
        } 
    }
}
