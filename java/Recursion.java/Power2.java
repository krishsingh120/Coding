public class Power2 {
    public static int Optmzpower(int x,int n){ // O(log(n))
        if(n==0){
            return 1;
        }
       int halfpow = Optmzpower(x,n/2);
       int pow = halfpow * halfpow;
       // if n is odd
       if(n % 2 != 0){
        pow = pow * x;
      }
       return pow;
    }
    public static void main(String[] args){
        int x=2;
        int n=10;
        System.out.print(Optmzpower(x,n));
    }
}
