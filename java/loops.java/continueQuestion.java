import java.util.*;
public class continueQuestion {
 public static void main(String agrs[]){
      Scanner sc = new Scanner(System.in);
        do{
         System.out.print("enter number:");
           int n=sc.nextInt();
            if(n%10==0) continue;
            else System.out.println(n);
       } while(true);
   }
}
