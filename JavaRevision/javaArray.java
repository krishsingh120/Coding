import java.util.*;

public class javaArray {

    public static int linearSearch(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return arr[i];
            }
        }
        return -1;
    }

    public static boolean binarySearch(int arr[], int key) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == key) { // key is found
                return true;
            } else if (mid > key) { // searching in 1st half
                end = mid - 1;
            } else { // searching in 2nd half
                start = mid + 1;
            }
        }

        return false;
    }

    public static int LargestElem(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int SecLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > smax) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void ReverseArr(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // System.out.println("hello");
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        print(arr);

    }

    public static void AllPairs(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subArray(int arr[]) {
        int n = arr.length;
        int ts = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                ts++;
                System.out.print("  ");
                if (sum > max) {
                    max = sum;
                }
                System.out.print("-> " + sum + "    ");
            }
            System.out.println(" ");
        }

        System.out.println("Max sum is: " + max);
        System.out.println("total subarray: " + ts);
    }

    public static void MaxSubarrSum1(int arr[]) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum > max)
                    max = sum;
            }
        }

        System.out.println("Max sub array sum is: " + max);
    }

    public static void MaxSubarrSum2(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("max sum is: " + max);
        // print(prefix);
    }

    public static void KadanesAlgo(int arr[]) {
        int n = arr.length;
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            if (cs > max) {
                max = cs;
            }
        }

        System.out.println("Max sum is: " + max);
    }

    public static void TrappedWater(int arr[]) {
        int n = arr.length;
        int maxWater = 0;
        int lmin = 0;
        int rmin = 0;
        int width = 1;

        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] < arr[j]) {
                if (arr[i] > lmin) {
                    lmin = arr[i];
                }
                maxWater = maxWater + ((lmin - arr[i]) * width);
                i++;
            } else {
                if (arr[j] > rmin) {
                    rmin = arr[j];
                }
                maxWater = maxWater + ((rmin - arr[j]) * width);
                j--;
            }
        }
        System.out.println(maxWater);

    }

    public static int StockProblem(int arr[]) {
        int n = arr.length;
        int maxProfit = 0;
        int bp = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < bp) {
                bp = arr[i];
            } else {
                int profit = arr[i] - bp;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        if (maxProfit != 0) {
            return maxProfit;
        }

        return 0;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };

        // int n = 16;
        // System.out.println(linearSearch(arr, n));

        // System.out.println(binarySearch(arr, 7));

        // System.out.print(LargestElem(arr));

        // System.out.print(SecLargest(arr));

        // ReverseArr(arr);

        // AllPairs(arr);

        // subArray(arr);

        // MaxSubarrSum1(arr);

        // MaxSubarrSum2(arr);

        // KadanesAlgo(arr);
        // TrappedWater(arr);

        int ans = StockProblem(arr);
        System.out.println(ans);

    }
}
