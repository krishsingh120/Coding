import java.util.*;

class stackA {

    static class stack {
        ArrayList<Integer> list = new ArrayList<>();
        int size = 0;

        // is Empty
        boolean isEmpty() {
            if (size == 0)
                return true;

            return false;
        }

        // push
        void push(int val) {
            list.add(val);
            size++;
        }

        // pop
        int pop() {
            if (size == 0) {
                return -1;
            }
            int elem = list.get(size - 1);
            System.out.println(elem);
            list.remove(size - 1);
            size--;

            return elem;
        }

        // peek
        int peek() {
            if (size == 0) {
                return -1;
            }

            int elem = list.get(size - 1);
            System.out.println(elem);
            return elem;
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(8);

        s.pop();
        s.pop();
        s.pop();
        s.peek();
    }
}