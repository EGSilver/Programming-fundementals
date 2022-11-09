package Arraylists.Artikel;

public class Artikel {
    private String omschrijving;
    private double nettoprijs;
    private final double BTW_PERCENTAGE = 1.21;

    public Artikel(String omschrijving, double nettoprijs) {
        this.omschrijving = omschrijving;
        this.nettoprijs = nettoprijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getNettoprijs() {
        return nettoprijs;
    }

    public void setNettoprijs(double nettoprijs) {
        this.nettoprijs = nettoprijs;
    }

    public double getBTW_PERCENTAGE() {
        return BTW_PERCENTAGE;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "omschrijving='" + omschrijving + '\'' +
                ", nettoprijs=" + nettoprijs +
                ", BTW_PERCENTAGE=" + BTW_PERCENTAGE +
                '}';
    }
}
