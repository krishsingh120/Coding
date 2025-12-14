import java.util.*;
public class productOFtwo {

    public static int calculateproduct(int num1,int num2){
         int product=num1*num2;
         return product;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int  product=calculateproduct(a,b);
      System.out.println("prooduct is: "+product);
    }
}
