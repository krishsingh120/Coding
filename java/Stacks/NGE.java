import java.util.Stack;

public class NGE {

    public static int[] nextGreaterElem(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];

        ans[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element to the right
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            // Push current element to stack
            st.push(arr[i]);

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };

        int ans[] = nextGreaterElem(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
