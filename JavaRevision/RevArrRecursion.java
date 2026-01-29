import java.util.Scanner;

public class RevArrRecursion {

  public static void reverse(int[] arr, int start, int end) {
    if (start > end)
      return;

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    reverse(arr, start + 1, end - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Take input size of array N: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    System.out.println("Take input array : ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    reverse(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
