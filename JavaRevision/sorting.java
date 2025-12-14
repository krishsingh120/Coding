import java.util.*;

public class sorting {
    public static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap (arr[j], arr[j+1])
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);

    }

    public static void SelectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        print(arr);

    }

    public static void InsertionSort(int arr[]) {
        int n = arr.length;

    }

    public static void CountSort(int arr[]) {
        int n = arr.length;

    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        // print(arr);

        // BubbleSort(arr);
        SelectionSort(arr);
    }
}
