package Oefeningen;

public class Opleidingsonderdeel {
    private double punten;
    private String omschrijving;

    public Opleidingsonderdeel(double punten, String omschrijving) {
        this.punten = punten;
        this.omschrijving = omschrijving;
    }

    public String returnPunten() {
        String s = omschrijving + " " + punten;
        return s;
    }

    public double getPunten() {
        return punten;
    }

    public void setPunten(double punten) {
        this.punten = punten;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Opleidingsonderdeel{" +
                "punten=" + punten +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }
}
