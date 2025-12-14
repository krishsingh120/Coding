public class frndPairs {
    public static int findtotalWays(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }
        //choice
        // single
        int fnm1 = findtotalWays(n-1);
        
        // pairs
        int fnm2 = findtotalWays(n-2);
        int pairways = (n-1) * fnm2;

        //total ways
        int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[] args) {

       System.out.println(findtotalWays(4)); 
    }
}
