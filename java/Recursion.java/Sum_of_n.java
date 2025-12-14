public class Sum_of_n {
    
    public static int calsum(int n){
        if(n==1){
         return 1;
        }
         // stack down
        int sum=n;
        sum = sum + calsum(n-1);
         return sum;
       }
       public static void main(String[] args){
           int n=6;
           System.out.print(calsum(n));
   
       }
}
