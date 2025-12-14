import java.util.*;

public class pushBottom {
    public static void bottomPush(Stack<Integer> s1, int val) {
        Stack<Integer> s2 = new Stack<>();
         s2.push(val);

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        System.out.println(s2);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // System.out.println(s);


        bottomPush(s, 10);
    }
}
