import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class arraylist {

    public static void printReverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + ", ");
        }
    }

    public static void ReverseList(ArrayList<Integer> list, int start, int end) {
        int i = start, j = end - 1;
        // System.out.println(list);

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        // System.out.println(list);
    }

    public static int MaxElement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int elem = list.get(i);
            // if (elem > max) {
            // max = elem;
            // }

            max = Math.max(max, elem);
        }
        return max;
    }

    public static void swap(ArrayList<Integer> list, int i, int j) {
        System.out.println(list.get(i) + "  " + list.get(j));
        // swap two numbers
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

        System.out.println(list.get(i) + "  " + list.get(j));
    }

    public static void sortlist(ArrayList<Integer> list) {
        System.out.println(list);
        Collections.sort(list); // ascending order
        Collections.sort(list, Collections.reverseOrder()); // descending order
        System.out.println(list);
    }

    public static int containerBrute(ArrayList<Integer> list) {
        int n = list.size();
        int max = Integer.MIN_VALUE;

        // Brute force approach
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int height = Math.min(list.get(i), list.get(j));
                int water = height * (j - i);
                max = Math.max(water, max);
            }
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // for (int k = i; k <= j; k++) {
        // int height = Math.min(list.get(i), list.get(j));
        // int water = height * (j - i);
        // max = Math.max(water, max);
        // }
        // }
        // }
        return max;
    }

    public static int containerOptimal(ArrayList<Integer> list) {
        int n = list.size();
        int max = Integer.MIN_VALUE;

        int i = 0, j = n - 1;

        while (i < j) {
            if (list.get(i) < list.get(j)) {
                int height = list.get(i);
                int water = height * (j - i);
                max = Math.max(max, water);
                i++;
            } else {
                int height = list.get(j);
                int water = height * (j - i);
                max = Math.max(max, water);
                j--;
            }
        }
        return max;
    }

    public static void pairSum1(ArrayList<Integer> list, int target) {
        int n = list.size();
        int i = 0, j = n - 1;

        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == target) {
                System.out.println("(" + list.get(i) + "," + list.get(j) + ")");
                return;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void pairSum2(ArrayList<Integer> list, int target) {
        // // Method-1
        // int n = list.size();
        // int lp = 0, rp = n - 1;

        // int k = 0;
        // for (int i = 0; i < n; i++) {
        // if (list.get(i + 1) > list.get(i)) {
        // k++;
        // } else {
        // k++;
        // break;
        // }
        // }

        // ReverseList(list, k, n);
        // ReverseList(list, 0, k);
        // ReverseList(list, 0, n);

        // while (lp < rp) {
        // int sum = list.get(lp) + list.get(rp);
        // if (sum == target) {
        // System.out.println("(" + list.get(lp) + "," + list.get(rp) + ")");
        // return;
        // } else if(sum > target) {
        // rp--;
        // } else {
        // lp++;
        // }
        // }

        // Method-2
        int n = list.size();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i + 1) > list.get(i)) {
                cnt++;
            } else {
                break;
            }
        }

        int rp = cnt, lp = cnt + 1;

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                System.out.println("(" + list.get(lp) + "," + list.get(rp) + ")");
                return;
            } else if (sum > target) {
                rp = (rp - 1 + n) % n;
            } else {
                lp = (lp + 1) % n;
            }
        }

    }

    public static void print(ArrayList<Integer> list) {
        System.out.println(list);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // print(list);
        // printReverse(list);
        // System.out.println(MaxElement(list));
        // int i = 1, j = 3;
        // swap(list, i, j);

        // sortlist(list);

        // System.out.println(containerBrute(list));

        // System.out.println(containerOptimal(list));

        // pairSum1(list, 15);

        // ReverseList(list);

        // pairSum2(list, 16);

    }
}
