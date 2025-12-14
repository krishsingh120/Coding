public class questions {

    public static int product(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static int factorial(int x) {
        int ans = 1;
        int i = 1;
        while (i <= x) {
            ans = ans * i;
            i++;
        }
        return ans;
    }

    public static int BinomialCoeff(int n, int r) {

        // calculate n factorial
        int fn = factorial(n);

        // calculate r factorial
        int fr = factorial(r);

        // calculate n-r factorial
        int fn_r = factorial((n - r));

        // calculate binomial coeff
        int binCoeff = fn / (fr * fn_r);

        return binCoeff;
    }

    public static void multiply(int a, int b) {
        int prod = a * b;
        System.out.println(prod);
    }

    public static void multiply(int a, int b, int c) {
        int prod = a * b * c;
        System.out.println(prod);
    }

    public static void multiply(float a, float b) {
        float prod = a * b;
        System.out.println(prod);
    }

    public static boolean checkPrime(int n) {
        // check only for n>=2
        // if (n == 0)
        // return 0;

        // if (n == 1)
        // return -1;

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int n) {

        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec(int n) {
        double ans = 0;
        int count = 0;

        while (n > 0) {
            int ld = n % 10;
            ans = ans + ld * (Math.pow(2, count));
            count++;
            n = n / 10;
        }
        System.out.println((long) ans);
    }

    public static void decToBin(int n) {
        int ans = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            n = n / 2;
            ans = ans + (rem * (int) Math.pow(10, pow));
            pow++;
        }
        System.out.println(ans);
    }

    public static void isPalindrome(int n) {
        int myNum = n;
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;
            rev = ld + (rev * 10);
            n = n / 10;
        }
        System.out.println(rev);
        if (myNum == rev)
            System.out.print("yes is palindrome");
        else
            System.out.println("Not palindrome");

    }

    public static void main(String[] args) {
        // int ans = product(5, 8);
        // System.out.println(ans);

        // int ans = BinomialCoeff(5, 2);
        // System.out.println(ans);

        // function overloading
        // multiply(5.0f, 6.9f);
        // multiply(5, 6, 2);
        // int ans = checkPrime(9);

        // if (ans == 1)
        // System.out.println("prime");
        // else if (ans == 0)
        // System.out.println("Neither prime nor composite");
        // else
        // System.out.println("Not prime");

        // primeInRange(23);
        // binToDec(100);
        // decToBin(5);
        isPalindrome(321);

    }
}
