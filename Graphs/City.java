public class City{
    String name;
    Connection [] neighbors;
    int pt = 0;

    public City(String name){
        this.name = name;
        this.neighbors = new Connection[10];
    }


    public void add(City dest, int distance){
        this.neighbors[pt++] = new Connection(dest, distance);
    }

}