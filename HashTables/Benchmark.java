public class Benchmark {
    public static void main(String[] args) {
        int[] sizes = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        System.out.printf("# searching through an array of length n, time in ns\n");
        System.out.printf("#%7s%8s%8s%8s\n", "n", "D","S","3rd");
        for (int n : sizes) {
            System.out.printf("%8d", n);

            Zip zip = new Zip("C:\\Users\\Serka\\Desktop\\postnummer.CSV");
            int k = 1000;

            double t = 0;
            double t2 = 0;
            double min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
                long t0 = System.nanoTime();
                zip.lookup(11115);
                long t1 = System.nanoTime();
                t += (t1 - t0);
                /*if (t < min)
                    min = t;*/
            }

            System.out.printf("%8.0f", (t/k));
            
            min = Double.POSITIVE_INFINITY;
            for (int i = 0; i < k; i++) {
                long t0 = System.nanoTime();
                //zip.binarySearch(99949);
                long t1 = System.nanoTime();
                t2 += (t1 - t0);
                /*if (t < min)
                    min = t;*/
            }

            System.out.printf("%8.0f\n", (t2/k));

        }
    }
}
