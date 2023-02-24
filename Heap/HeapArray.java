public class HeapArray {
    public Integer[] arr;

    public HeapArray(Integer size) {
        this.arr = new Integer[size];
    }

    public void add(Integer n) {
        if (arr[0] == null) {
            arr[0] = n;
        }
    }
}
