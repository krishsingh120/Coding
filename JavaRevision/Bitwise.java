public class Bitwise {

    public static int ANDOperator(int x, int y) {
        int ans = x & y;
        return ans;
    }

    public static int OROperator(int x, int y) {
        int ans = x | y;
        return ans;
    }

    public static int XOROperator(int x, int y) {
        int ans = x ^ y;
        return ans;
    }

    public static int OnesComplement(int x) {
        int Nof5 = ~x; // Not of 5

        int onesComp = ~Nof5; // ones comp(not Of 5)
        int ans = onesComp + 1; // addtion with one(1)
        return ans;
    }

    public static int leftShift(int a, int b) {
        int ans = a << b;

        // // by formula
        // int ans2 = a * (int)Math.pow(2, b);

        return ans;
    }

    public static int rightShift(int a, int b) {
        int ans = a >> b;

        // // by formula
        // int ans2 = a / (int)Math.pow(2, b);

        return ans;
    }

    public static void EvenOdd(int a) {
        int bitMask = 1;
        int ans = a & bitMask;

        if (ans == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static int get_ith_bit(int a, int ith) {
        int bitMask = 1;

        int shift = a >> (ith);
        int ans = shift & bitMask;

        return ans;
    }

    public static int set_ith_bit(int a, int ith) {
        int bitMask = (1 << ith);

        int ans = a | bitMask;
        return ans;
    }

    public static int clear_ith_bit(int a, int ith) {
        int bitMask = ~(1 << ith);

        int ans = a & bitMask;
        return ans;
    }

    public static int update_ith_bit(int num, int val, int ith) {
        int ans;
        // if (val == 1) {
        // ans = set_ith_bit(num, ith);
        // } else {
        // ans = clear_ith_bit(num, ith);
        // }

        num = clear_ith_bit(num, ith);
        int bitMask = val << ith;
        ans = bitMask | num;

        return ans;
    }

    public static int clear_i_bits(int num, int ith) {
        // int ans = -1;
        // for (int i = 0; i < ith; i++) {
        // num = clear_ith_bit(num, i);
        // ans = num;
        // }
        // return ans;

        int ans = -1;
        int bitMask = (~0) << ith;
        ans = num & bitMask;

        return ans;
    }

    public static int clearRangeOfBits(int num, int i, int j) {
        // int ans = -1;
        // System.out.println(num);
        // for (int k = i; k < j; k++) {
        // num = clear_ith_bit(num, k);
        // ans = num;
        // }

        // return ans;

        int a = (~0) << j + 1;
        int b = (1 << i) - 1; // pow(2,i) - 1

        int bitMask = a | b;
        int ans = num & bitMask;

        return ans;
    }

    public static boolean PowOfTwo(int num) {

        int check = num & (num - 1);
        if (check != 0) {
            return false;
        }

        return true;
    }

    public static int CountSetBits(int num) {
        int count = 0;
        while (num != 0) {
            int LSB = num & 1;
            // System.out.println(LSB);
            if (LSB != 0) {
                count++;
            }
            num = num >> 1;
        }

        return count;
    }

    public static void main(String args[]) {

        // And operator
        // System.out.println(ANDOperator(5, 6));
        // OR operator
        // System.out.println(OROperator(5, 6));
        // XOR operator
        // System.out.println(XOROperator(5, 6));

        // System.out.println(OnesComplement(5));

        // System.out.println(leftShift(5, 2));

        // System.out.println(rightShift(6, 3));

        // EvenOdd(12);

        // System.out.println(get_ith_bit(12, 3));

        // System.out.println(set_ith_bit(10, 2));

        // System.out.println(clear_ith_bit(10, 2));

        // System.out.println(update_ith_bit(10, 0, 2));

        // System.out.println(clear_i_bits(5, 2));

        // System.out.println(clearRangeOfBits(18, 1, 3));

        // System.out.println(PowOfTwo(7));

        System.out.println("Count is: " + CountSetBits(16));

    }
}
