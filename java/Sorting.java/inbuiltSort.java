import java.util.Arrays;

public class inbuiltSort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 3, 1, 7, 6, 2 };
        int si = 0;
        int ei = 6;
        Arrays.sort(arr, si, ei);
        printarr(arr);

    }
}