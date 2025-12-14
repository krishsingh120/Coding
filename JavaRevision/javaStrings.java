import java.util.*;

public class javaStrings {

    public static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            char left = str.charAt(i);
            char right = str.charAt(j);

            if (left != right) {
                return false;
            }
            i++;
            j--;

        }

        return true;
    }

    public static float shortestPath(String path) {
        float shortPath = -1;
        int ver = 0, hor = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'E') {
                hor++;
            }
            if (dir == 'W') {
                hor--;
            }
            if (dir == 'N') {
                ver++;
            }
            if (dir == 'S') {
                ver--;
            }
        }

        int sqrX = hor * hor;
        int sqrY = ver * ver;
        shortPath = (float) Math.sqrt(sqrX + sqrY);

        return shortPath;
    }

    public static String largestString(String str[]) {
        String largest = str[0];

        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static String UpperCase(String sentence) {
        String str[] = sentence.split(" ");
        StringBuilder newstr = new StringBuilder("");

        for (String word : str) {
            if (!word.isEmpty()) {
                char c = word.charAt(0);
                newstr.append(Character.toUpperCase(c)).append(word.substring(1)).append(" ");
            }
        }
        return newstr.toString().trim();
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1; // Start with 1st character
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1; // reset for new character
            }
        }

        // Append the last group
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        // System.out.println(checkPalindrome("krish"));
        // System.out.println(shortestPath("WNEENESENNN"));

        // String str[] = { "apple", "mango", "banana" };
        // System.out.println(largestString(str));

        // String sentence = "hi, i am krish singh";
        // System.out.println("Old String: " + sentence);
        // System.out.println("New String: " + UpperCase(sentence));

        String str = "aaabbcccd";
        System.out.println(stringCompression(str));
    }
}
