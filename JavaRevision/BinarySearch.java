import java.util.*;

public class BinarySearch {
    public static long calPow(int n, int m, int mid) {
        long power = 1;
        for (int i = 0; i < n; i++) {
            power *= mid;
            if (power > m)
                break; // Early exit to avoid overflow
        }

        return power;
    }

    public static int findSqrt(int n, int m) {
        int sqrt = -1;
        int low = 1;
        int high = m;
        // System.out.println(high);

        if (m == 1) {
            return 1;
        }
        if (m == 2)
            return 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // System.out.println(mid);

             long elem = calPow(n, m, mid);
            System.out.println(elem);

            if (elem == m) {
                return mid;
            }

            if (elem < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        // System.out.println(sqrt);
        return sqrt;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 9;
        int ans = findSqrt(n, m);
        System.out.println(ans);
    }
}
