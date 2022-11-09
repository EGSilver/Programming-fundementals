package Oefeningen2;

public class Product {
    private String omschrijving;
    private int aantalInVoorraad;
    private double prijs;

    public Product(String omschrijving, int aantalInVoorraad, double prijs) {
        this.omschrijving = omschrijving;
        this.aantalInVoorraad = aantalInVoorraad;
        this.prijs = prijs;
    }

    public void verhoogPrijs(double percentage) {
        this.prijs = this.prijs * (1+percentage/100);
        System.out.println(this.prijs);
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
        if (prijs <= max && prijs >= min) {
        this.prijs = prijs;
        }  else System.out.println("Prijs moet tussen " + max + " en " + min +" liggen");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", aantalInVoorraad=" + aantalInVoorraad +
                ", prijs=" + prijs +
                '}';
    }
}
