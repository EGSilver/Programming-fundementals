package Rapport2;

public class Vak {
    private String naam;
    private int punten;

    public Vak(int punten, String naam) {
        this.naam = naam;
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    @Override
    public String toString() {
        return "Vak{" +
                "naam='" + naam + '\'' +
                ", punten=" + punten +
                '}';
    }
}
