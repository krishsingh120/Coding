class Solution {
    public static int minMaxDifference(int num) {

        int ans = 0;
        int n = num;


        // System.out.println("hello");


        int revNum = reverseNum(num);
        System.out.println("max rev is: " + revNum);
        int notNine = 0;
        while (revNum > 0) {
            int ld = revNum % 10;
            if (ld == 9) {
                revNum /= 10;
            } else {
                notNine = ld;
                break;
            }
        }
        int max = maxReplace(revNum, notNine);

        System.out.println("max num is: " + max);

        int revNum2 = reverseNum(num);
        System.out.println("min rev is: " + revNum2);
        int notZero = 0;
        while (revNum2 > 0) {
            int ld = revNum2 % 10;
            if (ld == 9) {
                revNum2 /= 10;
            } else {
                notZero = ld;
                break;
            }
        }

        int min = minReplace(revNum2, notZero);
        System.out.println("min num is: " + min);

        return ans = Math.abs(max - min);

    }

    public static int maxReplace(int num, int digit) {
        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            if (ld == digit) {
                rev = (rev * 10) + 9;
                num /= 10;
            } else {
                rev = (rev * 10) + ld;
                num /= 10;
            }
        }

        return rev;
    }

    public static int minReplace(int num, int digit) {
        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            if (ld == digit) {
                rev = (rev * 10) + 0;
                num /= 10;
            } else {
                rev = (rev * 10) + ld;
                num /= 10;
            }
        }

        return rev;
    }

    public static int reverseNum(int num) {

        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            rev = ld + (rev * 10);
            num /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int num = 11891;
        System.out.println(minMaxDifference(num));
    }
}
