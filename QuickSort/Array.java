import java.util.Random;

public class Array {

    public static int[] createArray(int n) {
        Random rnd = new Random();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(n*2);
        }
        arr[n] = Integer.MAX_VALUE;
        return arr;
    }
}
