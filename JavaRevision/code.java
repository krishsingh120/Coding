import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class code {
    public static long splitArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(i)) {
                sumA += nums[i];
            } else {
                sumB += nums[i];
            }
        }

        // System.out.println(a);
        // System.out.println(b);

        // int sumA = 0;
        // for (Integer val : a) {
        // sumA += val;
        // }

        // int sumB = 0;
        // for (Integer val : b) {
        // sumB += val;
        // }

        // System.out.println(sumA + " " + sumB);

        long diff = Math.abs(sumA - sumB);

        return diff;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; // Handle 0, 1, and negative numbers

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4 };

        System.out.println(splitArray(nums));

    }
}

