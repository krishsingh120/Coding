public class stackL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class stack {
        static Node head = null;
        static int size = 0;

        // is empty
        public static boolean isEmpty(){
            return head == null;
        }

        // push
        public static void push(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                size++;
                return;
            }

            newnode.next = head;
            head = newnode;
            size++;
        }

        // pop
        public static int pop(){
            if(head == null && size == 0){
                return -1;
            }

            int data = head.data;
            head = head.next;
            size--;
            System.out.println(data);

            return data;
        }

        // peek
        public static int peek(){
            if(head == null && size == 0){
                return -1;
            }
            int data = head.data;
            System.out.println(data);

            return data;
        }


    }

    public static void main(String[] args) {
       stack s = new stack();

       s.push(5);
       s.push(4);
       s.push(3);
       s.push(2);
       s.push(1);


      System.out.println(s.size);

    }
}
