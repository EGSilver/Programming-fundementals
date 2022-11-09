package Arraylists.Artikel;

import java.util.ArrayList;

public class Klant {
    private String naam;
    private String postcode;
    private ArrayList<Artikel> gekochteArtikelen = new ArrayList<Artikel>();

    public Klant(String naam, String postcode) {
        this.naam = naam;
        this.postcode = postcode;
    }

    public void koop(Artikel e) {
        gekochteArtikelen.add(e);
    }

    public void maakKassaTicket() {
        System.out.println(this.naam + ", woonachtig te " + this.postcode + " heeft de volgende artikelen gekocht");
        double totaalExBTW = 0;
        double totaalIncBTW = 0;
        for (Artikel e : gekochteArtikelen) {
            System.out.println(e.getOmschrijving() + " " + e.getNettoprijs() * e.getBTW_PERCENTAGE() + "€");
            totaalExBTW += e.getNettoprijs();
            totaalIncBTW += e.getNettoprijs() * e.getBTW_PERCENTAGE();
        }
        System.out.println("Totaal inc BTW: " + totaalIncBTW);
        System.out.println("Tottal exl BTW: " + totaalExBTW);
    }

    public String print() {
        String s = this.naam + " " + this.postcode + " heeft de volgende artikelen gekocht\n";
        double totaalExBTW = 0;
        double totaalIncBTW = 0;
        for (Artikel e : gekochteArtikelen) {
            s = s + e.getOmschrijving() + " " + e.getNettoprijs() * e.getBTW_PERCENTAGE() + "€\n";
            totaalExBTW += e.getNettoprijs();
            totaalIncBTW += e.getNettoprijs() * e.getBTW_PERCENTAGE();

        } s = s + "Totaal inc BTW: " + totaalIncBTW + "\n";
        s = s + "Totaal inc BTW: " + totaalExBTW;
        return s;
    }

    public double bepaalGoedkooptste() {
        double voorlopigkleinste = gekochteArtikelen.get(0).getNettoprijs();
        for (Artikel e : gekochteArtikelen) {
            if (e.getNettoprijs() < voorlopigkleinste) {
                voorlopigkleinste = e.getNettoprijs();
            }
        } return voorlopigkleinste;
    }

    public double bepaalGrootste() {
        double voorlopigGrootste = gekochteArtikelen.get(0).getNettoprijs();
        for (Artikel e : gekochteArtikelen) {
            if (e.getNettoprijs() > voorlopigGrootste) {
                voorlopigGrootste = e.getNettoprijs();
            }
        } return voorlopigGrootste;
    }

    public Artikel bepaalGrootsteA() {
        Artikel vergelijk = null;
        Artikel grootste = gekochteArtikelen.get(0);
        for (Artikel e : gekochteArtikelen) {
            if (e.getNettoprijs() > grootste.getNettoprijs()) {
                grootste = e;
            } for (Artikel z : gekochteArtikelen) {
                if (z.getNettoprijs() == grootste.getNettoprijs()) {
                    vergelijk = z;
                }
            }
        }System.out.println(vergelijk);
        return grootste;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", postcode='" + postcode + '\'' +
                ", gekochteArtikelen=" + gekochteArtikelen +
                '}';
    }
}
