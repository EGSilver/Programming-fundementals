public class Product {
    private String omschrijving;
    private int aantal;

    public Product(String omschrijving, int aantal) {
        this.aantal = aantal;
        this.omschrijving = omschrijving;
    }

    public void print() {
        System.out.println(aantal + " " + omschrijving);
    }
}
