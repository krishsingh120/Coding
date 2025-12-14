public class Factorial {
    public static int fact(int n){
       if(n==0){
        return 1;
       }
        // stack down
        int fn = n * fact(n-1);
        return fn;
      }
      public static void main(String[] args){
          int n=5;
          System.out.print(fact(n));
  
      }
}
