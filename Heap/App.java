public class App {
    public static void main(String[] args) throws Exception {
        /*List list = new List();
        list.addStart(4);
        list.addStart(7);
        list.addStart(9);
        System.out.println(list.head.value);
        System.out.println(list.last.value);*/

        /*List list = List.generateList(5);
        List.outputList(list);
        list.removeBeginning();
        List.outputList(list);

        list.removeBeginning();
        List.outputList(list);

        list.removeBeginning();
        List.outputList(list);

        list.removeBeginning();
        List.outputList(list);
        
        list.removeBeginning();
        List.outputList(list);*/
        Heap myHeap = new Heap();
        // Integer depthPush = 0;
        Integer depthAdd = 0;
        myHeap.add(5);
        myHeap.add(4);
        myHeap.add(3);
        myHeap.add(2);
        myHeap.add(12);
        myHeap.add(11);
        myHeap.add(7);
        myHeap.add(18);
        depthAdd = myHeap.add(1);

        // System.out.println(myHeap.root.value);
        // System.out.println(myHeap.root.left.value);
        // System.out.println(myHeap.root.right.value);
        // System.out.println(myHeap.root.left.left.value);
        // System.out.println("\nAfter pushing root...\n");
        // depth = myHeap.push(10);
        // System.out.println(myHeap.root.value);
        // System.out.println(myHeap.root.right.value);
        // System.out.println(myHeap.root.left.value);
        // System.out.println(myHeap.root.left.left.value);
        // System.out.printf("The depth is %d%n", depth);
        System.out.println("\n Testing Depth for add \n");
        System.out.println(depthAdd);
        Integer a = 7/2;
        System.out.println("The number is " + a);
        // System.out.println(myHeap.root.value);
        // Integer x = myHeap.remove();
        // System.out.println("\nAfter Removal\n");
        // System.out.println(myHeap.root.value);
        // System.out.println(myHeap.root.left.value);
        // System.out.println(myHeap.root.right.value);
        // myHeap.remove();
        // System.out.println("\nAfter Removal\n");
        // System.out.println(myHeap.root.value);
        // System.out.println(myHeap.root.left.value);
        // myHeap.remove();
        // System.out.println("\nAfter Removal\n");
        // System.out.println(myHeap.root.value);
        // System.out.println("\n after removal\n");

    }
}
