public class Benchmark {
    public static void main(String[] args){
        int[] sizes = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        System.out.printf("# searching through an array of length n, time in ns\n");
        System.out.printf("#%7s%8s%8s%8s\n", "n", "1st","2nd","3rd");
        for (int n : sizes) {
            System.out.printf("%8d", n);

            int k = 1000;

            double min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
                //LinkedList a = LinkedList.generateList(20);
                //LinkedList b = LinkedList.generateList(n);
                long t0 = System.nanoTime();
                LinkedList a = LinkedList.forBenchmark(n);
                long t1 = System.nanoTime();
                double t = (t1 - t0);
                if (t < min)
                    min = t;
            }

            System.out.printf("%8.0f", (min));
            
            min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
                int[] arr1 = Array.generateArray(20000);
                int[] arr2 = Array.generateArray(n);
                long t0 = System.nanoTime();
                Array.append(arr1, arr2);
                long t1 = System.nanoTime();
                double t = (t1 - t0);
                if (t < min)
                    min = t;
            }
            System.out.printf("%8.0f\n", (min));

        }
}
}