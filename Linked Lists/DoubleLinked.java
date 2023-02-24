import java.util.Random;
public class DoubleLinked {
    int head; 
    DoubleLinked tail; 
    DoubleLinked prev;
    
    public DoubleLinked(int item, DoubleLinked list, DoubleLinked previous) {
        head = item; 
        tail = list; 
        prev = previous; 
    }

    public int head() {
        return this.head; 
    }

    public DoubleLinked tail() {
        return this.tail; 
    }

    public DoubleLinked prev() {
        return this.prev; 
    }

    public void append(DoubleLinked b) {
        DoubleLinked nxt = this; 
        while (nxt.tail != null) {
            nxt = nxt.tail; 
        }
        nxt.tail = b; 
    }

    public void remove(int index) {
        DoubleLinked nxt = this; 
        int temp = 0; 

        if (index == 0) {
            App.dll = nxt.tail; 
            App.dll.prev = null;
            return;
        }

        while (nxt.tail != null) {
            temp++; 
            if (temp == index) {
                nxt.tail = nxt.tail.tail; 
                nxt.tail.prev = nxt; 
                return;
            }
            nxt = nxt.tail; 
        }
    }

    public void add(DoubleLinked list, int index) {
        DoubleLinked nxt = this; 
        int temp = 0; 

        if (index == 0) {
            list.tail = App.dll;
            App.dll.prev = list;
            App.dll = list; 
            return; 
        }

        while (nxt.tail != null) {
            temp++;
            if (temp == index) {
                list.tail = nxt.tail; 
                nxt.tail.prev = list;
                list.prev = nxt; 
                nxt.tail = list; 
                return; 
            }
            nxt = nxt.tail; 
        }
        nxt.tail = list; 
    }

    public static DoubleLinked DllGenerator(int n) {
        Random random = new Random();
        DoubleLinked dList = new DoubleLinked(random.nextInt(n*5), null, null);
        for (int i = 1; i < n; i++) {
            dList.append(new DoubleLinked(random.nextInt(n*5), null, dList));
        }
        return dList;
    }

    public static void outputDll(DoubleLinked a) {
        while (a.tail != null) {
            System.out.print(a.head + " - ");
            a = a.tail; 
        }
        System.out.println(a.head);
    }
}
