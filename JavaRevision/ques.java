import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class ques {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        sb.append(strs[0]);

        System.out.println(sb);
        for (int i = 1; i < strs.length; i++) {
            sb = compare(sb.toString(), strs[i]);
        }

        return sb.toString();
    }

    public static StringBuilder compare(String longest, String str) {
        StringBuilder sb = new StringBuilder("");
        int minLength = Math.min(longest.length(), str.length());
        for (int i = 0; i < minLength; i++) {
            if (longest.charAt(i) == str.charAt(i)) {
                sb.append(longest.charAt(i));
            }
            // System.out.println(longest.charAt(i));
        }

        return sb;
    }

    public static void main(String args[]) {
        String str[] = { "dog","racecar","car" };
        System.out.println(longestCommonPrefix(str));
    }
}
