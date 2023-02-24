public class App {
    public static void main(String[] args) throws Exception {
        Zip zip = new Zip("C:\\Users\\Serka\\Desktop\\postnummer.CSV");
        // System.out.println(zip.data[0].code);
        // System.out.println(zip.data[0].name);
        // System.out.println(zip.data[0].pop);
        // System.out.println(zip.data[0].code);
        // System.out.println(zip.lookup(99499));
        // System.out.println(zip.keys[8000]);
        // boolean lookup = zip.lookup(11115);
        // boolean binary = zip.binarySearch(11115);
        // System.out.println("Lookup " + lookup + " \nbinary search " + binary);
        // Integer a = 10;
        // Integer b = 20;
        // System.out.println(b.compareTo(a));
        zip.collisions(15000);

    }
}
