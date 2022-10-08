public class TestBloem {
    public static void main(String[] args) {
        Bloem tulp = new Bloem("Tulp", "rood",2);
        tulp.print();
        tulp.manipulatePrice(0.5);
        Bloem roos = new Bloem("Roos", "geel",3);
        roos.print();
        roos.manipulatePrice(1.0);
    }
}
