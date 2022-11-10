package clownOpdracht;

import java.util.Arrays;

public class Clown {
    private String artiestennaam;
    private double vergoeding;
    private boolean werkt[] = new boolean[7];
    private double schaterindex[] = new double[365];

    public Clown(String artiestennaam, double vergoeding) {
        this.artiestennaam = artiestennaam;
        this.vergoeding = vergoeding;
        for (int i = 0; i < werkt.length; i++) {
            werkt[i] = true;
        }
    }

    // 0 is zondag, 6 is zaterdag.
    public void vrijDag(int dag) {
        werkt[dag] = false;
    }

    public void gelachen(double dec, int dag) {
        schaterindex[dag] = dec;
    }


    //Bepaal de lachtoeslag van de clown als 10€ maal de gemiddelde lachindex.
    public void berekenLachIndex() {
        double totaal = 0;
        double res = 0;
        for (int i = 0; i < schaterindex.length; i++) {
            res += schaterindex[i];
        }
       totaal = res / artiestennaam.length();
        System.out.println(totaal);
    }

    public void overzichtDB() {
        double totaal = 0;
        for (int i = 0; i < schaterindex.length; i++) {
            if (schaterindex[i] != 0) {
                System.out.println("dag " + (i+1) + " " + schaterindex[i]);
            }
        }
    }

    public double overzichtLoon() {
        double totaal = 0;
        for (int i = 0; i < schaterindex.length; i++) {
            if (schaterindex[i] != 0) {
                totaal += vergoeding;
            }
        }
        return totaal;
    }

    public String overzichtWerkdagen() {
        String s = this.getArtiestennaam() + "Werkt op de volgende dagen : \n";
        String[] dagenWeek = {"zondag", "maandag", "dinsdag", "woesndag", "donderdag", "vrijdag", "zaterdag"};
        for (int i = 0; i < werkt.length; i++) {
           if (werkt[i]) {
               s += dagenWeek[i]+"\n";
           }

        } return s;
    }

    //Vanaf dan (vanaf dag 11) is er een bonus van 10% op de
    //20 20%
    //

    public double berekenBonus() {
        double counter = 0;
        double totaal = 0;
        for (int i = 0; i < schaterindex.length; i++) {
            if (schaterindex[i] != 0) {
                counter++;

            }
            if (counter > 10 && counter < 20) {
                totaal = vergoeding * 1.10;
            } else if (counter <= 20 && counter > 10) {
                totaal = vergoeding * 1.20;
            }
        }
        setVergoeding(totaal);
        return totaal;
    }

    public double berekenBonus1() {
        double counter = 0;
        double totaal = 0;
        for (int i = 0; i < schaterindex.length; i++) {
            if (schaterindex[i] != 0) {
                counter++;
            } if (counter <= 10 ) {
                totaal = counter * vergoeding;
            } else if (counter < 20) {
                totaal = 10 * vergoeding + (counter-10) * vergoeding * 1.1;
            } else {
                totaal = 10 * vergoeding + 9 * vergoeding * 1.1 + (counter-19) * vergoeding * 1.2;
            } ////250
            return totaal;
        }
        return counter;
    }

    public String getArtiestennaam() {
        return artiestennaam;
    }

    public void setArtiestennaam(String artiestennaam) {
        this.artiestennaam = artiestennaam;
    }

    public double getVergoeding() {
        return vergoeding;
    }

    public void setVergoeding(double vergoeding) {
        this.vergoeding = vergoeding;
    }

    public boolean[] getWerkt() {
        return werkt;
    }

    public void setWerkt(boolean[] werkt) {
        this.werkt = werkt;
    }

    public double[] getSchaterindex() {
        return schaterindex;
    }

    public void setSchaterindex(double[] schaterindex) {
        this.schaterindex = schaterindex;
    }

    @Override
    public String toString() {
        return "Clown{" +
                "artiestennaam='" + artiestennaam + '\'' +
                ", vergoeding=" + vergoeding +
                ", werkt=" + Arrays.toString(werkt) +
                ", schaterindex=" + Arrays.toString(schaterindex) +
                '}';
    }
}
