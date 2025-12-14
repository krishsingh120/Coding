import java.util.*;

public class pascalTriangle {

    public static int NcR(int n, int r) {
        int ans = 1;

        for (int i = 0; i < r; i++) {
            ans *= (n - i);
            ans /= (i + 1);
        }

        return ans;
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                tempList.add(NcR(row, col));
            }
            ans.add(tempList);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pascalTriangle(6));
    }
}
