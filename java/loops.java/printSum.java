import java.util.*;
public class printSum {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      System.out.print("enter number:");
        int n = sc.nextInt();
        int i,sum = 0;        
        while(i<=n){  
         sum+=i;    
            i++;
        }  System.out.print(sum);
    }
}

