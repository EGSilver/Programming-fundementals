package Oefeningen;

import java.util.ArrayList;

public class Klant {
    private String naam, postcode;
    private ArrayList<Artikel> gekochteArtikelen = new ArrayList<>();

    public Klant(String naam, String postcode) {
        this.naam = naam;
        this.postcode = postcode;
    }

    public void koop(Artikel a) {
        this.gekochteArtikelen.add(a);
    }

    public void maakKassaticket() {
        System.out.println("***Kassa Ticket***\n" + this.naam +" is woonachtig te " + this.postcode + " heeft de volgende artikelen gekocht:");
        double BTWinc = 0;
        double BTWexl = 0;
        for (Artikel a : gekochteArtikelen) {
            double res = (a.getNettoPrijs() * a.getBTW_PERCENTAGE());
            BTWexl = BTWexl + a.getNettoPrijs();
            BTWinc = BTWinc + a.totaalIncBtw();
            System.out.println(a.getOmschrijving() + ": " + res);
        }
        System.out.println("BTW exclusief: " + BTWexl);
        System.out.println("BTW exclusief: " + BTWinc);
    }

    public String print() {
        String s = "***Kassa Ticket***\n" + this.naam + " is woonachtig te " + this.postcode + " heeft de volgende artikelen gekocht:";
        for (Artikel a : gekochteArtikelen) {
        }
        return s;
    }

    public Artikel bepaaldGoedkoopste() {
        System.out.println("Goedkoopste product op de rekening is:");
        Artikel goedkoopste = gekochteArtikelen.get(0);
        for (Artikel a : gekochteArtikelen) {
            if (a.getNettoPrijs() < goedkoopste.getNettoPrijs()) {
                goedkoopste = a;
            }
        } return goedkoopste;
    }

    public Artikel bepaalduurste() {
        System.out.println("Duurste product op de rekening is:");
        Artikel duurste = gekochteArtikelen.get(0);
        for (Artikel a : gekochteArtikelen) {
            if (a.getNettoPrijs() > duurste.getNettoPrijs()) {
                duurste = a;
            }
        } return duurste;
    }

/*    public ArrayList bepaalGrootstePrijs() {
        ArrayList returnlist = gekochteArtikelen;
        Artikel duurste = gekochteArtikelen.get(0);
        System.out.println("Duurste producten op de rekening zijn");
        for (Artikel a : gekochteArtikelen) {
            if (returnlist < duurste.getNettoPrijs()) {
                duurste = a;
            }
        }
        return returnlist;
    }*/


    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", postcode='" + postcode + '\'' +
                ", gekochteArtikelen=" + gekochteArtikelen +
                '}';
    }
}
