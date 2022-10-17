package Oefeningen;

public class Artikel {
    private String omschrijving;
    private double nettoPrijs;
    private final double BTW_PERCENTAGE = 1.21;

    public Artikel(String omschrijving, double nettoPrijs) {
        this.omschrijving = omschrijving;
        this.nettoPrijs = nettoPrijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getNettoPrijs() {
        return nettoPrijs;
    }

    public void setNettoPrijs(double nettoPrijs) {
        this.nettoPrijs = nettoPrijs;
    }

    public double getBTW_PERCENTAGE() {
        return BTW_PERCENTAGE;
    }

    public double totaalIncBtw() {
        // double res = this.nettoPrijs + this.prijs*(this.BTW_PERCENTAGE/100)
        double res = this.nettoPrijs + (this.nettoPrijs * BTW_PERCENTAGE);
        return res;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "omschrijving='" + omschrijving + '\'' +
                ", nettoPrijs=" + nettoPrijs +
                ", BTW_PERCENTAGE=" + BTW_PERCENTAGE +
                '}';
    }
}
