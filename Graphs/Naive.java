public class Naive {
    public static void main(String[] args) {
        search("Malmö", "Göteborg", 100000);
        // search( "Göteborg", "Stockholm", 220);
        // search( "Malmö", "Stockholm", 200);





        // Map map = new Map("trains.csv");
        // String from = args[0];
        // String to = args[1];
        // Integer max = Integer.valueOf(args[2]);
        // long t0 = System.nanoTime();
        // Integer dist = shortest(map.lookup(from), map.lookup(to), max);
        // long time = (System.nanoTime() - t0)/1_000_000;
        // System.out.println("shorest: " + dist + " min (" + time + " ms)");
    }

    private static void search(String fr, String t, int m){
        Map map = new Map("trains.csv");
         String from = fr;
         String to = t;
         Integer max = m;
         long t0 = System.nanoTime();
         Integer dist = shortest(map.lookup(from), map.lookup(to), max);
         long time = (System.nanoTime() - t0)/1_000_000;
         if(dist == null){
            System.out.println("NOT FOUND! Increase the max!");
        }
        else{

            System.out.println("shorest: " + dist + " min (" + time + " ms)");
        }

    }

    private static Integer shortest(City from, City to, Integer max) {
        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
        for (int i = 0; i < from.neighbors.length; i++) {
            if (from.neighbors[i] != null) {
                Connection conn = from.neighbors[i];
                Integer dist = shortest(conn.city,to, max-conn.dist);
                if((dist != null) && ((shrt == null) || (shrt > dist + conn.dist))){
                    shrt = dist + conn.dist;
                }
                if((shrt != null) && (max > shrt)){
                    // System.out.println("max from " + from.name + "set to " + shrt);
                    max = shrt;
                }
            }
        }
        return shrt;
    }
}
