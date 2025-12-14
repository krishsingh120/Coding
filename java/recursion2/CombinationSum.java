import java.util.*;

public class CombinationSum {

    public static void combSum(int i, List<Integer> list, int arr[], int target) {
        // base case
        if (i == arr.length) {
            if (target == 0) {
                System.out.println(list);
            }
            return;
        }

        // no. of times take
        if (arr[i] <= target) {
            list.add(arr[i]);
            combSum(i, list, arr, target - arr[i]); 
            list.remove(list.size() - 1);
        }

        // not take
        combSum(i + 1, list, arr, target);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };

        List<Integer> list = new ArrayList<>();
        combSum(0, list, arr, 7);

    }
}
