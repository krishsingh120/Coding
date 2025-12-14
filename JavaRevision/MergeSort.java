import java.util.*;

public class MergeSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int[] merge(int arr[], int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        // if left is remaining
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        // if right is remaining
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        // transfer all element from list to arr
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }

        return arr;
    }

    public static void mergesort(int arr[], int low, int high) {
        if (low >= high) return;
        
        int mid = (low + high) / 2;

        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 5, 1, 4, 23 };
        print(arr);
        mergesort(arr, 0, arr.length - 1);
        print(arr);
    }
}
