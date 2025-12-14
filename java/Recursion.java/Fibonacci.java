public class Fibonacci {
    
    public static int fibo(int n){
       if(n==0 || n==1) 
          return n;
         // stack down
        int fn = fibo(n-1) + fibo(n-2);
        return fn;
       }
       public static void main(String[] args){
           int n=6;
           System.out.print(fibo(n));

       }    
}
