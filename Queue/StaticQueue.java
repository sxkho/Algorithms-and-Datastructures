public class StaticQueue {
    Integer head = 0;
    Integer freeSlot = 1;
    int length; 
    Integer[] arr;
    boolean overlap;

    public void Array(int n) {
        length = n; 
        arr = new Integer[n];
    }

    public void add(Integer n) {
        
        // If the free slot is equal to the length n, and there has been no overlap
        if (freeSlot == length && overlap == false) {
            arr[freeSlot - 1] = n;
            freeSlot = 0; 
            overlap = true;
        }

        // If the above is false and overlap is true, check if freeSlot is < head and put in value, if freeSlot >= head, problem
        else if (overlap == true) {
            if (freeSlot < head) {
                arr[freeSlot++] = n;
            }
            else {
                // Dynamic part... 
                System.out.println("Problem... queue is full");
                Integer[] newArr = new Integer[length * 2];
                freeSlot = 0;
                Integer temp;
                for (int i = 0; i < length; i++) {
                    temp = remove();
                    if (temp != null) {
                        newArr[i] = temp;
                        freeSlot++;
                    }
                }
                newArr[freeSlot++] = n;
                head = 0;
                length *= 2;
                overlap = false;
                arr = newArr;
                System.out.println(arr[3]);
            }
        }

        // if none of this is true, add as usual

        else {
            arr[freeSlot-1] = n;
            freeSlot++;
        }

    }

    public Integer remove() {
        if (head == null) {
            return null;
        }

        if (head == length) {
            head = 0; 
        }

        Integer removeValue = arr[head];
        arr[head] = null; 
        head++;

        if (head == freeSlot) {
            head = 0;
            freeSlot = 1;
            overlap = false;
        }
        return removeValue;
    }

    public void printout() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println("\n");
    }

}
