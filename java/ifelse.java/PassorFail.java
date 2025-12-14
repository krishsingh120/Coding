import java.util.*;
public class PassorFail {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks=sc.nextInt();  
       String rc=(marks>=33)? "pass": "fail";  // ternary operator.
       System.out.println(rc);
}
}
