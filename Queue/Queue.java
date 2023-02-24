public class Queue {
    Node head;
    Node last; //

    public class Node {

        public Integer item;
        public Node tail;

        public Node(Integer item, Node list) {
            this.item = item;
            this.tail = list;
        }
    }

    public Queue() {
        head = new Node(null, null);
        last = head;
    }

    public void add(Integer item) {
        Node nxt = this.head;
        while (nxt.tail != null) {
            nxt = nxt.tail;
        }
        nxt.tail = new Node(item, null);
    }

    public void add2(Integer item) {
        last.tail = new Node(item, null);
        last = last.tail;
    }

    public void remove() {
        Queue nxt = this;
        if (nxt.head == null) {
            throw new NullPointerException(" The queue is empty !");
        }
        nxt.head = nxt.head.tail;
    }
}
