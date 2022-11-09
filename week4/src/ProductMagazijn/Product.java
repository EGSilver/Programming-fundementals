package ProductMagazijn;

public class Product {
    private String omschrijving;
    private int aantalInVoorraad;
    private double prijs;

    public Product(String omschrijving, int aantalInVoorraad, double prijs) {
        this.omschrijving = omschrijving;
        this.aantalInVoorraad = aantalInVoorraad;
        this.prijs = prijs;
    }

    public void verhoogprijs(double percent) {
        this.prijs *= (1+percent);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public int getAantalInVoorraad() {
        return aantalInVoorraad;
    }

    public void setAantalInVoorraad(int aantalInVoorraad) {
        this.aantalInVoorraad = aantalInVoorraad;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        double min = this.prijs * 0.9;
        double max = this.prijs * 1.10;
        if (prijs > this.prijs * (1.10) || prijs < this.prijs * (0.9)) {
            System.out.println("Prijs moet tussen de: " + max + " en " + min +" liggen");
        } else {
            this.prijs = prijs;
            System.out.println("Succes");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", aantalInVoorraad=" + aantalInVoorraad +
                ", prijs=" + prijs +
                '}';
    }
}
