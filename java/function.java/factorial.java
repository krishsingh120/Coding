import java.util.*;
public class factorial {

    public static int Factorial(int n){
        int f=1;

        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;   // factorial of n
    }
    public static void main(String args[]){
      System.out.print(Factorial(6));;
    }
}
