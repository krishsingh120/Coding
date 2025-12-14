import java.util.*;

public class printNum {

    // parameterised
    public static void printSum1(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }

        printSum1(i - 1, sum + i);
    }

    // functional recursion
    public static int printSum2(int n) { // problem broken down into smaller part like -- f(n-1) => f(3) => f(2) => f(1)
                                         // => f(0) => return 0;
        if (n == 0) {
            return 0;
        }

        return n + printSum2(n - 1);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rev(int arr[], int i) {
        if (i >= (arr.length / 2)) {
            print(arr);
            return;
        }

        // swap using indices
        swap(arr, i, arr.length - i - 1);

        rev(arr, i + 1);
    }

    public static void ans(int cnt) {
        if (cnt > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static void checkPalindorme(String s, int i, int cnt) {
        if (i >= (s.length() / 2)) {
            ans(cnt);
            return;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            cnt++;
        }

        checkPalindorme(s, i + 1, cnt);
    }

    public static void main(String[] args) {
        // printSum1(5, 0);
        // System.out.println(printSum2(3));

        // System.out.println(fact(5));

        // System.out.println(fibo(6));

        // int arr[] = { 1, 2, 3, 4, 5 };
        // rev(arr, 0);

        String s = "racecar";
        checkPalindorme(s, 0, 0);

    }
}
