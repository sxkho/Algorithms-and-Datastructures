import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = Array.createArray(9);
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
        int j = partition(arr, l, h);
        sort(arr, l, j);
        sort(arr, j + 1, h);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (j > i) {
            do {
                i++;
            } while(arr[i] <= pivot);

            do {
                j--;
            } while(arr[j] > pivot);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tempVar = arr[low];
        arr[low] = arr[j];
        arr[j] = tempVar;
        //System.out.println(Arrays.toString(arr));
        return j;
    }
}
