import java.util.*;
public class primeInRange {
   
    public static Boolean isprime(int n){
        // corner case (n=2)
        if(n==2){
         return true;
        }
        // corner case (n=1)
        else if(n==1){   
         System.out.print("nor prime nor composite\n");
        }
        // case (n>2)
        else {
         for(int i=2; i<=Math.sqrt(n); i++){
             if(n%i==0){         // completely dividing 
              return false;
             }
         }
     }
         return true;
     }

     public static void primeinrange(int n){
        for(int i=2; i<=n; i++){
           if(isprime(i)){
            System.out.print(" "+i);
           }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.print("enter number: ");
          int n=sc.nextInt();
            primeinrange(n);
    }
}
