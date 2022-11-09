package RapportVariatie;

public class Vak {
    private String omschrijving;
    private int studiepunten;

    public Vak(String omschrijving, int studiepunten) {
        this.omschrijving = omschrijving;
        this.studiepunten = studiepunten;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public int getStudiepunten() {
        return studiepunten;
    }

    public void setStudiepunten(int studiepunten) {
        this.studiepunten = studiepunten;
    }

    @Override
    public String toString() {
        return "Vak{" +
                "omschrijving='" + omschrijving + '\'' +
                ", studiepunten='" + studiepunten + '\'' +
                '}';
    }
}
