import java.util.ArrayList;
import java.util.Scanner;

public class subSeqRecursion {

  public static void printAllSubSeq(int arr[], ArrayList<Integer> list, int i) {
    if (i == arr.length) {
      System.out.println(list);
      return;
    }

    list.add(arr[i]);

    // take
    printAllSubSeq(arr, list, i + 1);
    list.remove(list.size() - 1);
    // not take
    printAllSubSeq(arr, list, i + 1);
  }

  public static int subSeqK(int arr[], ArrayList<Integer> list, int i, int sum, int cnt) {
    if (i == arr.length) {
      if (sum == 2) {
        return 1;
      } else {
        return 0;
      }
    }

    list.add(arr[i]);
    sum += arr[i];

    int left = subSeqK(arr, list, i + 1, sum, cnt);
    list.remove(list.size() - 1);
    sum -= arr[i];

    int right = subSeqK(arr, list, i + 1, sum, cnt);

    return left + right;

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 1, 2, 1};
    int k = 2;
    ArrayList<Integer> list = new ArrayList<>();

    // printAllSubSeq(arr, list, 0);

    int ans = subSeqK(arr, list, 0, 0, 0);
    System.out.println(ans);

  }
}
