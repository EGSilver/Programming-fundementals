public class TestProduct {
    public static void main(String[] args) {
        Product pennen = new Product("pennen", 10);
        Product object = new Product("potloden", 20);
        pennen.print();
        object.print();
    }
}
