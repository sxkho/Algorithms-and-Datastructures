import java.util.Random;
public class LinkedList {
    int head; 
    LinkedList tail; 

    public LinkedList(int item, LinkedList list) {
        head = item; 
        tail = list; 
    }

    public int head() {
        return this.head; 
    }

    public LinkedList tail() {
        return this.tail; 
    }

    public void append(LinkedList b) {
        LinkedList nxt = this; 
        while (nxt.tail != null) {
            nxt = nxt.tail; 
        }
        nxt.tail = b; 
    }

    public static LinkedList generateList(int n) {
        Random random = new Random();
        LinkedList list = new LinkedList(random.nextInt(n), null);
        for (int i = 1; i < n; i++) {
            list.append(new LinkedList(random.nextInt(n*5), null));
        }
        return list; 
    }

    public static LinkedList forBenchmark(int n) {
        LinkedList list = new LinkedList(0, null);
        for (int i = 1; i < n; i++) {
            list.append(new LinkedList(0, null));
        }
        return list; 
    }

    public static void outputList(LinkedList a) {
        while (a.tail != null) {
            System.out.print(a.head + " - ");
            a = a.tail; 
        }
        System.out.println(a.head);
    }

    public static void push(int x) {
        LinkedList temp = new LinkedList(x, App.myList);
        App.myList = temp;
    }

    public static int pop() {
        int x = App.myList.head;
        App.myList = App.myList.tail;
        return x;
    }

}
