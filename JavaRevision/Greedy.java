import java.util.*;

public class Greedy {

    public static int maxNum(Integer arr[], int v) {
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= v && arr[i] > max) {
                max = arr[i];
            }
        }

        // System.out.println("Max: " + max);

        return max;
    }

    public static void EndNotSort(int start[], int end[]) {
        int n = start.length;

        // if end is not sorted
        int activities[][] = new int[n][3];

        for (int k = 0; k < n; k++) {
            activities[k][0] = k;
            activities[k][1] = start[k];
            activities[k][2] = end[k];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> list = new ArrayList<>();

        int max = 1;
        list.add(activities[0][0]);
        int prevEnd = activities[0][2];

        for (int i = 1; i < n; i++) {
            if (prevEnd < activities[i][1]) {
                max++;
                list.add(activities[i][0]);
                prevEnd = activities[i][2];
            }
        }

        System.out.println("Activity no. is: " + list);

        System.out.println("Max Activity Selection is: " + max);
    }

    public static void ActivitySelection(int start[], int end[]) {
        int n = start.length;
        int m = end.length;
        int i = 1, j = 1;

        ArrayList<Integer> list = new ArrayList<>();

        int max = 1;
        list.add(0);
        int prevEnd = end[j - 1];

        while (i < n || j < m) {
            if (prevEnd <= start[i]) {
                max++;
                list.add(i);
                i++;
                j++;
                prevEnd = end[j - 1];
            } else {
                i++;
                j++;
            }
        }

        for (int k = 0; k < list.size(); k++) {
            System.out.print("A" + list.get(k) + " ");
        }

        System.out.println("\n" + "Max Activity Selection is: " + max);

    }

    public static double FractionalKnapsack(int val[], int w[], int wt) {
        // Approach-1
        // double maxVal = 0;
        // int checkWt = 0;

        // for (int i = 0; i < val.length; i++) {
        // checkWt += w[i];
        // if (wt == checkWt) {
        // return maxVal;
        // } else if (wt > checkWt) {
        // maxVal += val[i];
        // } else {
        // int overWt = checkWt - wt;
        // int x = w[i] - overWt;
        // int fracWt = (val[i] / w[i]) * x;
        // maxVal += fracWt;
        // }
        // }

        // return maxVal;

        // Appraoach-2
        int n = val.length;
        int ratio[] = new int[n];
        int maxVal = 0;
        int capacity = wt;

        for (int i = 0; i < n; i++) {
            ratio[i] = val[i] / w[i];
        }

        // if ratio in descending order
        for (int i = 0; i < n; i++) {
            if (capacity >= w[i]) {
                capacity -= w[i];
                maxVal += val[i];
            } else {
                maxVal += (ratio[i] * capacity);
            }
        }

        return maxVal;
    }

    public static double FractionalKnapsack2(int val[], int w[], int wt) {
        double maxVal = 0;
        int capacity = wt;
        int n = val.length;
        double ratio[][] = new double[n][2]; // create 2-D array

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // col(0) => idx
            ratio[i][1] = (val[i] / (double) w[i]); // col(1) => ratio
        }

        // ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = n - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= w[idx]) {
                capacity -= w[idx];
                maxVal += val[idx];
            } else {
                maxVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        return maxVal;

    }

    public static int MinSumAbsDiff(int arr[], int brr[]) {
        int minSum = 0;
        int n = arr.length;

        // sort both the arrays
        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - brr[i]);
            minSum += diff;
        }

        return minSum;
    }

    public static int MaxPairChain(int pairs[][]) {
        int n = pairs.length;

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sorting based on 2nd index

        int maxChain = 1;
        int lastNum = pairs[0][1];

        for (int i = 1; i < n; i++) {
            if (lastNum < pairs[i][0]) {
                maxChain++;
                lastNum = pairs[i][1];
            }
        }

        return maxChain;
    }

    public static int IndianCoins(Integer arr[], int amt) {
        int ans = -1;
        int v = amt;
        int count = 0;

        // Arrays.sort(arr);

        while (v > 0) {
            int max = maxNum(arr, v);
            if (max == -1) {
                ans = max;
                return ans;
            }
            count = count + (v / max);
            v = v % max;
        }

        ans = count;

        return ans;
    }

    public static int IndianCoinsOptimize(Integer arr[], int amt) {
        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        int n = arr.length;
        int count = 0;
        int i = 0;

        while (i < n && amt > 0) {
            if (arr[i] <= amt) {
                count += amt / arr[i];
                amt = amt % arr[i];
            }
            i++;
        }

        return (amt == 0) ? count : -1; // return -1 if amount couldn't be made
    }

    public static ArrayList<Integer> jobSequencing1(int deadline[], int profit[]) {
        int n = deadline.length;
        ArrayList<Integer> list = new ArrayList<>();

        int time = 1;
        int maxProfit = profit[0];

        for (int i = 1; i < n; i++) {
            if (time < deadline[i]) {
                maxProfit += profit[i];
                time++;
            }
        }

        list.add(time);
        list.add(maxProfit);

        return list;
    }

    public static ArrayList<Integer> jobSequencing2(int deadline[], int profit[]) {
        int n = deadline.length;
        ArrayList<Integer> list = new ArrayList<>();

        int result[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            result[i][0] = i;
            result[i][1] = deadline[i];
            result[i][2] = profit[i];
        }

        // sort in ascending order
        Arrays.sort(result, Comparator.comparingDouble(o -> o[2]));

        int time = 1;
        int maxProfit = result[n - 1][2]; // last element always considered
        // System.out.println(maxProfit);

        for (int i = n - 2; i >= 0; i--) {
            if (time < result[i][1]) {
                maxProfit += result[i][2];
                time++;
            }
        }

        list.add(time);
        list.add(maxProfit);

        return list;
    }

    static class Job {
        int deadline;
        int profit;
        int id; // 1(A), 2(B), 3(C)....

        // constructur
        public Job(int i, int d, int p) {
            deadline = d;
            profit = p;
            id = i;
        }
    }

    public static void jobSequencing3(int jobInfo[][]) {
        int n = jobInfo.length;

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // Collections.sort(jobs, (a, b) -> a.profit - b.profit); // ascending sort on
        // object
        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // descending sort on objects

        ArrayList<Integer> list = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (time < curr.deadline) {
                list.add(curr.id);
                time++;

            }
        }

        System.out.println("Max seq: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int ChocolaProblem(Integer costHor[], Integer costVer[]) {
        int n = costHor.length;
        int m = costVer.length;

        // sorting of costs in descending order
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int totalCost = 0;

        while (h < n && v < m) {
            if (costHor[h] <= costVer[v]) { // vertical cut
                totalCost = totalCost + (costVer[v] * hp);
                vp++;
                v++;
            } else { // horizontal cut
                totalCost = totalCost + (costHor[h] * vp);
                hp++;
                h++;
            }
        }

        while (h < n) {
            totalCost = totalCost + (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < m) {
            totalCost = totalCost + (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println(totalCost);

        return totalCost;
    }

    public static void main(String args[]) {
        // int start[] = { 1, 3, 2, 5 };
        // int end[] = { 2, 4, 3, 6 };

        // ActivitySelection(start, end);
        // EndNotSort(start, end);

        // int val[] = { 8, 2, 10, 1, 9, 7, 2, 6, 4, 9 };
        // int w[] = { 10, 1, 7, 7, 5, 1, 8, 6, 8, 7 };
        // int wt = 21;

        // System.out.println(FractionalKnapsack(val, w, wt));
        // System.out.println(FractionalKnapsack2(val, w, wt));

        // int a[] = { 4, 1, 8, 7 };
        // int b[] = { 2, 3, 6, 5 };

        // System.out.println("Min absolute diff sum: " + MinSumAbsDiff(a, b));

        // int pairs[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
        // System.out.println("Max length chain is pairs: " + MaxPairChain(pairs));

        // Integer arr[] = { 1, 2, 5 };
        // int amt = 11;
        // System.out.println("Ans is: " + IndianCoins(arr, amt));
        // System.out.println(IndianCoinsOptimize(arr, amt));

        // int deadline[] = { 3, 1, 2, 2 };
        // int profit[] = { 50, 10, 20, 30 };
        // int jobInfo[][] = { { 3, 50 }, { 1, 10 }, { 2, 20 }, { 2, 30 } };

        // System.out.println(jobSequencing1(deadline, profit));
        // System.out.println(jobSequencing2(deadline, profit));
        // jobSequencing3(jobInfo);

        Integer costHor[] = { 2, 1, 3, 1, 4 };
        Integer costVer[] = { 4, 1, 2 };

        System.out.println("Total min cost is: " + ChocolaProblem(costHor, costVer));

    }
}
