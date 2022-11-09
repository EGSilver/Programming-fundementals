package Rapport;

public class Vak {
    private int punten;
    private String vak;

    public Vak(int punten, String vak) {
        this.punten = punten;
        this.vak = vak;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public String getVak() {
        return vak;
    }

    public void setVak(String vak) {
        this.vak = vak;
    }

    @Override
    public String toString() {
        return "Vak{" +
                "punten=" + punten +
                ", vak='" + vak + '\'' +
                '}';
    }
}
