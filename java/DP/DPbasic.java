import java.util.Arrays;

public class DPbasic {
    public static int f(int dp[], int n) {
        // base case 
        if(n <= 1){
            return n;
        }

        // dp check
        if(dp[n] != -1){
            return dp[n];
        }


        return dp[n] = f(dp, n - 1) + f(dp, n - 2);
    }

    public static void main(String[] args) {
        int dp[] = new int[7 + 1];
        Arrays.fill(dp, -1);
        System.out.println("Ans of dp is: " + f(dp, 7));
    }
}
