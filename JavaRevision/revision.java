import java.util.*;

public class revision {

    public static void butterfly(int n) {

        // 1st half
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            // print spaces
            for (int j = 0; j < 2 * (n - 1 - i); j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }

            // print spaces
            for (int j = 0; j < (2 * i); j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void SolidRhombus(int n) {
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            // // print spaces
            // for (int j = 0; j < i; j++) {
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }


    public static void HollowRhombus(int n) {
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // // print spaces
            // for (int j = 0; j < i; j++) {
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }


    public static void Diamond(int n) {

        // 1st half
        for (int i = 0; i < n; i++) {

            // print spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < (2 * (i + 1) - 1); j++) {
                System.out.print("*");
            }

            // // print spaces
            // for (int j = 0; j < (n - i - 1); j++) {
            //     System.out.print(" ");
            // }
            System.out.println();
        }

        // 2nd half
        for (int i = 0; i < n; i++) {

            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }

            // // print spaces
            // for (int j = 0; j < i; j++) {
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }


    public static void NumPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print numbers with space
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1 + " ");
            }

            System.out.println(); // Move to next line
        }
    }

    
    public static void main(String[] args) {
        int n = 5;

        // butterfly(n);
        // SolidRhombus(n);
        // HollowRhombus(n);
        // Diamond(n);
        // NumPyramid(n);
    }

}