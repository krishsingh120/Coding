import java.util.*;
public class decTobin {
    public static void dectobin(int n){
        int mynum=n;
        int pow=0;
        int binNum=0;
        while(n>0){

          int rem = n % 2;
          binNum = binNum + (rem * (int)Math.pow(10,pow));
          pow++;
          n=n/2;
        }
        System.out.print("binary of " +mynum+" = "+binNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
            int decNum=sc.nextInt();
            dectobin(decNum);
    } 
}
