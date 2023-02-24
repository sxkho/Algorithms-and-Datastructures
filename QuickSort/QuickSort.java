public class QuickSort {
    
    public static void sort(int[] arr, int l, int h) {
        int indexPartition = partition(arr, l, h);
        partition(arr, l, indexPartition - 1);
        partition(arr, indexPartition + 1, h);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (j > i) {
            do {
                i++;
            } while(arr[i] <= pivot && i < high - 1);

            do {
                j--;
            } while(arr[j] > pivot && j >= low);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tempVar = arr[low];
        arr[low] = arr[j];
        arr[j] = tempVar;
        return j;
    }
}
