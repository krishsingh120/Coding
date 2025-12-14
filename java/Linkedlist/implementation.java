public class implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void addStart(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;

        }

        void addMiddle(int data, int index) {
            Node newNode = new Node(data);
            Node temp = head;

            if (index > size || index < 0) {
                System.out.println("wrong index");
                return;
            }

            if (head == null) {
                addStart(data);
                return;
            }

            if (index == size) {
                add(data);
                return;
            }

            int cnt = 0;
            while (cnt < index - 1) {
                temp = temp.next;
                cnt++;
            }

            newNode.next = temp.next;
            temp.next = newNode;
            size++;

        }

        boolean getAt(int val) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == val) {
                    return true;
                }
                temp = temp.next;
            }

            return false;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int deleteStart() {
            Node temp = head;

            if(size <= 1){
                System.out.println("linkedlist is null");
                return -1;
            }

            head = head.next;
            temp.next = null;
            temp = head;
            size--;
            return head.data;
        }

        int deleteEnd() {
            Node temp = head;
            if(size <= 1){
                System.out.println("linkedlist is null");
                return -1;
            }

            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;

            size--;

            return tail.data;
        }

        int deleteAt(int index) {
            Node temp = head;
            int res = -1;

            for (int i = 1; i <= index - 1; i++) {
               temp = temp.next;
            }
            res = temp.next.data;
            temp.next = temp.next.next;

            size--;

            return res;
        }

        // int size() {
        // Node temp = head;
        // int count = 0;
        // while (temp != null) {
        // count++;
        // temp = temp.next;
        // }

        // return count;
        // }

    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.add(1);
        ll.add(5);
        ll.add(3);
        ll.add(9);
        ll.add(12);
        ll.add(0);

        // 1 -> 5 -> 3 -> 9 -> 12

        ll.display();
        // ll.addMiddle(6, 3);
        // ll.display();

        // System.out.println(ll.getAt(2));

        System.out.println("size of ll is: " + ll.size);

        System.out.println(ll.deleteStart());
        System.out.println(ll.deleteEnd());


        // System.out.println("deleted node is: " + ll.deleteAt(3));
        // ll.display();

    

    }
}
