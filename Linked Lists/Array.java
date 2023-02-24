import java.util.Random; 
public class Array {
    public static void main(String[] args) {

    }

    public static int[] append(int[] a, int[] b) {
        int size = a.length + b.length; 
        int[] arr = Allocate(size);
        fillArr(arr, a, b, size);
        return arr;
    }

    public static int[] generateArray(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n*4);
        }
        return arr; 
    }

    public static int[] Allocate(int a) {
        int [] largeArray = new int[a];
        return largeArray;
    }

    public static void fillArr(int[] toFill, int[] arr1, int[] arr2, int size) {

        for (int i = 0; i < arr1.length; i++) {
            toFill[i] = arr1[i];
        }

        int k = 0;
        for (int i = arr1.length; i < size; i++) {
            toFill[i] = arr2[k];
            k++;
        }
    }
}
