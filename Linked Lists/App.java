public class App {
    public static LinkedList myList = LinkedList.generateList(3);
    public static DoubleLinked dll;
    public static void main(String[] args) throws Exception {
        /*
         * LinkedList myList = LinkedList.generateList(5);
         * System.out.println("\nHere comes a!");
         * LinkedList.outputList(myList);
         * System.out.println("\nHere comes b!");
         * LinkedList secondList = LinkedList.generateList(7);
         * LinkedList.outputList(secondList);
         * System.out.println("\nHere comes a append b!");
         * myList.append(secondList);
         * LinkedList.outputList(myList);
         */
        /*int[] arr1 = Array.generateArray(8);
        int[] arr2 = Array.generateArray(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));*/

        //LinkedList myList = LinkedList.generateList(4);
        /*LinkedList.outputList(myList);
        System.out.println("Pushing...\n");
        LinkedList.push(3);
        LinkedList.push(7);
        LinkedList.outputList(myList);
        System.out.println("popping...\n");
        int popped = LinkedList.pop();
        LinkedList.outputList(myList);
        System.out.println("The popped value is: " + popped);*/

        // REMOVE FUNKAR !
        dll = DoubleLinked.DllGenerator(6);
        DoubleLinked.outputDll(dll);
        dll.remove(2);
        DoubleLinked.outputDll(dll);

    }
}
