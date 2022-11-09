package Bibliotheek;

public class Membership {
    private int lidnummer;
    private String naam;
    private boolean inwoner;

    public Membership(int lidnummer, String naam, boolean inwoner) {
        this.lidnummer = lidnummer;
        this.naam = naam;
        this.inwoner = inwoner;
    }

    public void bepaalInwoner() {
        if (lidnummer >= 10000 && lidnummer <= 20000) {
            inwoner = true;
        } else if (lidnummer >= 20000 && lidnummer <= 30000) {
                inwoner = false;
            }
    }


    public int getlidnummer() {
        return lidnummer;
    }

    public void Setlidnummer(int i) {
        this.lidnummer = i;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean isInwoner() {
        return inwoner;
    }

    public void setInwoner(boolean inwoner) {
        this.inwoner = inwoner;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "nummer=" + lidnummer +
                ", naam='" + naam + '\'' +
                ", inwoner=" + inwoner +
                '}';
    }
}
