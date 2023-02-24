import java.io.BufferedReader;
import java.io.FileReader;

public class Zip {

    Node[] data;
    int max;
    Integer[] keys; 

    public class Node {

        Integer code;
        String name;
        Integer pop;

        public Node(Integer code, String name, Integer pop) {
            this.code = code;
            this.name = name;
            this.pop = pop;
        }

    }

    public Zip(String file) {
        data = new Node[100000];
        keys = new Integer[10000];

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer key = Integer.valueOf(row[0].replaceAll("\\s",""));
                keys[i++] = key;
                //data[key] = new Node(key, row[1], Integer.valueOf(row[2]));
            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println("file " + file + " not found");
        }
    }

    // public boolean lookup(String findCode) {
    //     for (int i = 0; i < 9675; i++) {
    //         if (data[i].code.equals(findCode)) {
    //             //System.out.printf("The code has been found at index %d%n", i);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public void collisions(int mod) {
        int[] data = new int[mod];
        int[] cols = new int[10];

        for (int i = 0; i < max; i++) {
            Integer index = keys[i] % mod;
            cols[data[index]]++;
            data[index]++;
        }

        System.out.println("Mod " + mod);
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + cols[i]);
        }
        System.out.println();
    }

    public boolean lookup(Integer findCode) {
        if (data[findCode] != null) {
            return true;
        } 
        return false;
    }

    public boolean binarySearch(Integer findCode) {
        int low = 0;
        int high = 9674;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid].code.equals(findCode)) {
                //System.out.println("The code has been found at index " + mid + ". Returning true");
                return true;
            }

            if (data[mid].code.compareTo(findCode) == -1 && mid < high) {
                low = mid + 1;
                continue;
            }

            if (data[mid].code.compareTo(findCode) == 1 && mid > low) {
                high = mid - 1;
                continue;
            }
            //System.out.println("The code " + findCode + " does not exist. Returning false");
            return false;
        }
        return false;
    }
}
