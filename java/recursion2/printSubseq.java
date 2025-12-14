import java.util.*;

public class printSubseq {

    public static void printAllSubseq(int i, List<Integer> list, int arr[]) {
        if (i == arr.length) { // base case fix
            System.out.println(list);
            return;
        }

        // take
        list.add(arr[i]);
        printAllSubseq(i + 1, list, arr);

        // not take (remove last added)
        list.remove(list.size() - 1);
        printAllSubseq(i + 1, list, arr);

    }

    public static void subseqEqToSum(int i, List<Integer> list, int arr[], int k) {
        if (i == arr.length) { // base case fix
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }

        // take
        list.add(arr[i]);
        // sum += arr[i];
        subseqEqToSum(i + 1, list, arr, k);

        // not take (remove last added)
        list.remove(list.size() - 1);
        // sum -= arr[i];
        subseqEqToSum(i + 1, list, arr, k);

    }

    public static boolean printOnlyOneSubseq(int i, List<Integer> list, int arr[], int sm, int sum) {
        if (i == arr.length) { // base case
            if (sm == sum) { // condition satisfied
                System.out.println(list);
                return true;
            } else { // condition not satisfied
                return false;
            }
        }

        // take
        list.add(arr[i]);
        sm += arr[i];
        if (printOnlyOneSubseq(i + 1, list, arr, sm, sum) == true) {
            return true;
        }

        // not take
        list.remove(list.size() - 1);
        sm -= arr[i];
        if (printOnlyOneSubseq(i + 1, list, arr, sm, sum) == true) {
            return true;
        }

        return false;
    }

    public static int countSubseq(int i, int arr[], int sm, int sum) {

        // This condition never satisfied
        // when this cond is valid - if array contains only positive num
        if (sm > sum) {
            return 0;
        }

        // base case
        if (i == arr.length) {
            if (sm == sum) { // condition satisfied
                return 1;
            } else { // condition not satisfied
                return 0;
            }
        }

        // take
        sm += arr[i];
        int l = countSubseq(i + 1, arr, sm, sum);

        // not take
        sm -= arr[i];
        int r = countSubseq(i + 1, arr, sm, sum);

        return l + r;
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 1, 2 };
        // List<Integer> list = new ArrayList<>();
        // printAllSubseq(0, list, arr);

        // int arr[] = { 1, 2, 1 };
        // List<Integer> list = new ArrayList<>();
        // subseqEqToSum(0, list, arr, 2);

        // int arr[] = { 1, 2, 1 };
        // List<Integer> list = new ArrayList<>();
        // printOnlyOneSubseq(0, list, arr, 0, 2);

        int arr[] = { 1, 2, 1 };
        System.out.println(countSubseq(0, arr, 0, 2));

    }
}
