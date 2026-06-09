
import java.util.*;

public class decToBin {
  public static String decToBinary(int n) {
    StringBuilder sb = new StringBuilder("");

    /**
     * binary rep -> 32 16 8 4 2 1
     * TC -> O(log2(n))
     * SC -> O(log2(n))
     */

    while (n != 1) {
      if (n % 2 == 1) {
        sb.append(1);
      } else {
        sb.append(0);
      }

      n = n / 2;
    }

    sb.append(1);
    sb.reverse();

    return sb.toString();
  }

  public static int binToDecimal(int n) {
    /**
     * binary rep -> 32 16 8 4 2 1
     * TC -> O(len)
     * SC -> O(1)
     */

    // 101 -> 5 or 7 -> 111

    int num = 0;
    int count = 0;
    int pow2 = 1;


    while (n > 0) {
      int ld = n % 10;
      int sum = pow2 * ld;
      count++;
      pow2 *= 2;
      num = num + sum;
      n = n / 10;
    }

    return num;
  }

  public static int count(int n) {
    int count = 0;

    while (n > 0) {
      int ld = n % 10;
      count++;
      n = n / 10;
    }

    return count;
  }

  public static int reverse(int n) {
    int rev = 0;

    while (n > 0) {
      int ld = n % 10;
      rev = (rev * 10) + ld;
      n = n / 10;
    }

    return rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.err.print("n is : ");
    // int n = sc.nextInt();

    // System.out.println(decToBinary(n));

    System.err.print("m is : ");
    int m = sc.nextInt();

    System.out.println(binToDecimal(m));
  }
}
