package Arraylists.Rapport;

public class Vakken {
    private int punten;
    private String naam;

    public Vakken(int punten, String naam) {
        this.punten = punten;
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    @Override
    public String toString() {
        return "Vakken{" +
                "punten=" + punten +
                ", naam='" + naam + '\'' +
                '}';
    }
}
