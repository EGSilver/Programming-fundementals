package Oefeningen2;

public class Artikel {
    private String omschrijving;
    private double prijs;
    private final double BTW_PERCENTAGE = 0.21;

    public Artikel(String omschrijving, double prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public double prijsIncBTW() {
        double res = this.prijs + this.prijs * BTW_PERCENTAGE;
        return res;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getBTW_PERCENTAGE() {
        return BTW_PERCENTAGE;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "omschrijving='" + omschrijving + '\'' +
                ", prijs=" + prijs +
                ", BTW_PERCENTAGE=" + BTW_PERCENTAGE +
                '}';
    }
}
