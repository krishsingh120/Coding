import java.util.Stack;

public class copyStack {

    public static void display(Stack<Integer> st){
        int n = st.size();
        int arr[] = new int[n];


        int i = n-1;
        while(!st.isEmpty()){
            arr[i] = st.pop();
            i--;
        }

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }

    public static void copyStack(Stack<Integer> st1) {
        Stack<Integer> temp = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();

        System.out.println("main stack is: " + st1);

        while (!st1.isEmpty()) {
            temp.push(st1.pop());
        }

        System.out.println("Temp stack is: " + temp);

        if (st1.isEmpty()) {
            while (!temp.isEmpty()) {
                st1.push(temp.pop());
            }
        }

        System.out.println("copy stack is: " + st1);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        // copyStack(st);

        display(st);



    }
}
