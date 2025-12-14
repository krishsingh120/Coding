import java.util.*;
public class Even_Odd {
    public static void main(String[] arg){
          int n = 4;
          int bitMask = 1;
          if((n & bitMask) == 1){
            System.out.println(n + " is odd");
          }
          else{
            System.out.println(n + " is even");
          }
    }
}
