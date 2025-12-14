import java.util.*;

public class constantWindow {

    public static int constantWindoow(int arr[], int k) {
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = 0;
        int l = 0;
        int r = k - 1;

        while (r < n - 1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static int longestSubarray(int arr[], int k) {
        int n = arr.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;

        while (r < n - 1) {
            sum += arr[r];

            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            // check valid window
            if (sum <= k) {
                r++;
                maxLen = Math.max(maxLen, r - l + 1);
            }

        }

        for(int i = l; i < r; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 3, 4, 5, -1 };
        int brr[] = { 2, 5, 1, 7, 10 };

        // int ans = constantWindoow(arr, 3);
        // System.out.println(ans);

        int res = longestSubarray(brr, 14);
        System.out.println(res);

    }
}
