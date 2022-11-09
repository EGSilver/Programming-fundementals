package RapportVariatie;

import java.util.ArrayList;

public class Rapport {
    private Student student;
    private ArrayList<Punt> punten = new ArrayList<>();

    public Rapport(Student student) {
        this.student = student;
    }
    //object van klasse punt.

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //niet tussen 0-20 error
    public void geefPunten(Vak v1, int punten) {
        if (punten > 20 || punten < 0) {
            System.out.println("Error");
        } else {
            Punt p1 = new Punt(v1, punten);
            this.punten.add(p1);
        }
    }

    public double gemiddelde() {
        double studiepunten = 0;
        double gemiddelde = 0;
        double res = 0;
        for (Punt p : punten) {
            res += p.getPunt() * p.getVak().getStudiepunten();
            studiepunten += p.getVak().getStudiepunten();
        }
        //berekenen het gemiddelde van de punten maar rekening houdend met het aantal studiepunten
        //Java 6stp telt voor 2 keer meer dan vb SQL
        gemiddelde = res / studiepunten;
        return gemiddelde;
    }

    public String overzicht() {
        double res = 0;
        String s = "";
        double gem = gemiddelde();
        //Behaalde op Java 12/20 en dat is 1.75 minder dan zijn/haar gemiddelde.
        for (Punt p : punten) {
            res = gemiddelde() - p.getPunt();
            if (res > 0) {
                s += "behaalde op het vak " + p.getVak().getOmschrijving() + " " + p.getPunt() + " en dat is " + (res) + " minder dan zijn/haar gemiddelde\n";
            } else {
                s += "behaalde op het vak " + p.getVak().getOmschrijving() + " " + p.getPunt() + " en dat is " + (-res) + " meer dan zijn/haar gemiddelde\n";
            }
        }
        return s;
    }

    public void pasPuntenAan(double percentage) {
        double res = 0;
        //max 20 punten
        //alle punten verhogen met percentage
        // maar als wie gebuisd was, er nu door is, dan gaat de verhoging niet door.
        for (Punt p : punten) {
            double verhoging = p.getPunt() * (1+percentage);
            if (p.getPunt() < 10) {
                p.setPunt((int) verhoging);
                System.out.println("Je was al niet geslaagd, punten zijn gewijzigd maar je kan niet slagen voor dit vak");
            } else if (p.getPunt() * (1+percentage) > 20) {
                System.out.println("Punten kom boven de 20, je kan maximaal 20 behalen");
                p.setPunt(20);
            } else {
                p.setPunt((int) verhoging);

            }
        }
    }


    @Override
    public String toString() {
        return "Rapport{" +
                "student=" + student +
                ", punten=" + punten +
                '}';
    }
}
