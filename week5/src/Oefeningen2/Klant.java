package Oefeningen2;

import java.util.ArrayList;

public class Klant {
    private String naam;
    private String postcode;
    private ArrayList<Artikel> gekochtArtikelen = new ArrayList<>();

    public Klant(String naam, String postcode) {
        this.naam = naam;
        this.postcode = postcode;
    }

    public void koopArtikel(Artikel e) {
        this.gekochtArtikelen.add(e);
    }

    public Artikel bepaalGrootste() {
        Artikel duurste = gekochtArtikelen.get(0);
        Artikel evenduurste = gekochtArtikelen.get(0);
        for (Artikel e : gekochtArtikelen) {
            if (e.getPrijs() > duurste.getPrijs()) {
                duurste = e;
            }

        }
        for (Artikel b : gekochtArtikelen) {
            if (b.getPrijs() == duurste.getPrijs()) {
                evenduurste = b;

            }
        } return duurste;
    }

        public Artikel bepaalKleinste () {
            Artikel goedkoopste = gekochtArtikelen.get(0);
            for (Artikel e : gekochtArtikelen) {
                if (e.getPrijs() < goedkoopste.getPrijs()) {
                    goedkoopste = e;
                }
            }
            return goedkoopste;
        }

        public void maakKassaTicket () {
            double exBTW = 0;
            double incBTW = 0;
            System.out.println("***Ticket***\n" + this.naam + " woonachtig te " + this.postcode + " heeft de volgende artikelen gekocht: \n");
            for (Artikel e : gekochtArtikelen) {
                System.out.println(e.getOmschrijving() + " " + e.getPrijs());
                exBTW += e.getPrijs();
                incBTW += e.prijsIncBTW();
            }
            System.out.println("prijs exlusief BTW = " + exBTW + "\n" + "prijs inclusief BTW = " + incBTW);
        }

        public String print () {
            double exBTW = 0;
            double incBTW = 0;
            String c = "";
            String completeString = "***Ticket***\n" + this.naam + " woonachtig te " + this.postcode + " heeft de volgende artikelen gekocht: \n";
            for (Artikel e : gekochtArtikelen) {
                exBTW += e.getPrijs();
                incBTW += e.prijsIncBTW();
                c = c + e.getOmschrijving() + " " + e.getPrijs() + "\n";
            }
            String z = "prijs exlusief BTW = " + exBTW + "\n" + "prijs inclusief BTW = " + incBTW;
            completeString = completeString + c + "\n" + z;
            return completeString;
        }

        @Override
        public String toString () {
            return "Klant{" +
                    "naam='" + naam + '\'' +
                    ", postcode='" + postcode + '\'' +
                    ", gekochtArtikelen=" + gekochtArtikelen +
                    '}';
        }
    }
