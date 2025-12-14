
public class LL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printLL(Node head) {
        Node temp = head;
        int count = 0;

        while (true) {
            if (temp == null)
                break;
            System.out.println(temp.data);
            count++;
            temp = temp.next;
        }

        System.out.println("length is: " + count);
    }

    public static void printLLRecursive(Node head) {
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        System.out.println(head.data);
        printLLRecursive(head.next);
    }

    public static void insertAtEnd(Node head) {
        Node newNode = new Node(100);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        printLL(head);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(1);
        Node e = new Node(9);

        // linked all nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // 5 -> 3 -> 6 -> 1 -> 9

        insertAtEnd(a);

    }

}