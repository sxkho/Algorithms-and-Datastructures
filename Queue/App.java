public class App {
    public static void main(String[] args) throws Exception {
        //Queue queue = new Queue();
        /*queue.add(24);
        //Queue.printout(queue);
        queue.add(28);
        //Queue.printout(queue);
        System.out.println(queue.head.item);
        System.out.println(queue.head.tail.item);
        System.out.println(queue.head.tail.tail.item);
        System.out.println("\n ---------------------------- \n");
        queue.remove();
        System.out.println(queue.head.item);
        System.out.println(queue.head.tail.item);
        System.out.println("\n ---------------------------- \n");
        queue.remove();
        System.out.println(queue.head.item);*/

        /*System.out.println("Here comes the last item of the queue : ");
        //System.out.println(queue.last.item);
        queue.add2(24);
        System.out.println("Here comes the first and the last item of the queue ");
        System.out.println(queue.head.item);
        System.out.println(queue.last.item);
        queue.add2(27);
        queue.add2(34);
        queue.add2(41);
        queue.add2(48);
        queue.add2(55);
        queue.remove();
        queue.remove();
        System.out.println(" Here come the first and last element after certain modifications ");
        System.out.println(queue.head.item);
        System.out.println(queue.last.item);*/

        /*queue.add2(24);
        queue.add2(28);
        System.out.println(queue.head.item);
        System.out.println(queue.last.item);
        System.out.println("\n ---------------------------- \n");
        queue.remove();
        System.out.println(queue.head.item);
        System.out.println(queue.last.item);
        System.out.println("\n ---------------------------- \n");
        queue.remove();
        System.out.println(queue.head.item);
        System.out.println(queue.last.item);*/

        StaticQueue testQ = new StaticQueue();
        testQ.Array(3);
        testQ.add(3);
        testQ.add(7);
        testQ.add(8);
        testQ.add(9);
        testQ.add(10);
        testQ.add(11);

        testQ.printout();
    }
}
