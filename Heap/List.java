import java.util.Random;

public class List {

    Node head;
    Node last;

    public class Node {

        int value;
        Node next;

        public Node(int item, Node tail) {
            value = item;
            next = tail;
        }

    }

    public void addStart(int nodeItem) {
        Node newNode = new Node(nodeItem, null);
        if (head == null) {
            last = newNode;
            head = last;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int removeEnd() {
        Node smallest = head;
        Node current = head;
        Node prev = null;

        while (current.next != null) {
            if (current.next.value < smallest.value) {
                smallest = current.next;
                prev = current;
            }
            current = current.next;
        }

        if (smallest != head) {
            prev.next = smallest.next;
        } else {
            head = head.next;
        }

        return smallest.value;
    }

    public void add(int nodeItem) {
        Node newNode = new Node(nodeItem, null);
        if (head == null) {
            head = newNode;
        } else {
            if (newNode.value < head.value) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    if (newNode.value < current.next.value) {
                        newNode.next = current.next;
                        current.next = newNode;
                        return;
                    }
                    current = current.next;
                }
                current.next = newNode;
            }
        }

    }

    public int removeBeginning() {
        int tr = head.value;
        head = head.next;
        return tr;
    }

    public static List generateList(int n) {
        Random random = new Random();
        List list = new List();
        list.add(random.nextInt(n * 5));
        for (int i = 1; i < n; i++) {
            list.add(random.nextInt(n * 5));
        }
        return list;
    }

    public static void outputList(List a) {
        Node n = a.head;
        while (n.next != null) {
            System.out.print(n.value + " - ");
            n = n.next;
        }
        System.out.println(n.value);
    }
}
