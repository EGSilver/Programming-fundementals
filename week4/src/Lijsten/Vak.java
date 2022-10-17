package Lijsten;

public class Vak {
    private String naam;
    private int studiepunten;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudiepunten() {
        return studiepunten;
    }

    public void setStudiepunten(int studiepunten) {
        this.studiepunten = studiepunten;
    }

    public Vak(String naam, int studiepunten) {
        this.naam = naam;
        this.studiepunten = studiepunten;
    }

    @Override
    public String toString() {
        return "Vak{" +
                "naam='" + naam + '\'' +
                ", studiepunten=" + studiepunten +
                '}';
    }
}
