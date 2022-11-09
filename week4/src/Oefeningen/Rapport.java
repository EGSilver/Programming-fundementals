package Oefeningen;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Rapport {
    private Student student;
    private ArrayList<Opleidingsonderdeel> lijst = new ArrayList<>();


    public Rapport(Student student) {
        this.student = student;
    }


    public void puntenOpvragen() {
        for (Opleidingsonderdeel opleidingsonderdeel : lijst) {
            double punten = opleidingsonderdeel.getPunten();
        }
    }

    public void afwijking() {
        double total = 0;
        for (Opleidingsonderdeel opleidingsonderdeel : lijst) {
            total = opleidingsonderdeel.getPunten() - berekenGemiddeldeFunctie();
            System.out.println(total);
        }
    }

    public double berekenGemiddeldeFunctie() {
        double res = 0;
        for (Opleidingsonderdeel opleidingsonderdeel : lijst) {
            res = res + opleidingsonderdeel.getPunten();
        }
        double gemiddelde = res / lijst.size();
        return gemiddelde;
    }

    public double berekenGemiddelde() {
        double bovenGemiddelde = 0;
        double onderGemiddelde = 0;
        double res = 0;
        for (Opleidingsonderdeel opleidingsonderdeel : lijst) {
            res = res + opleidingsonderdeel.getPunten();
        }
        double gemiddelde = res / lijst.size();
        for (Opleidingsonderdeel opleidingsonderdeel : lijst) {
            if (opleidingsonderdeel.getPunten() > gemiddelde) {
                bovenGemiddelde = bovenGemiddelde + 1;
            } else {
                onderGemiddelde = onderGemiddelde + 1;
            }
        }
        //System.out.println("Aantal vakken boven het gemiddelde = " + bovenGemiddelde);
        //System.out.println("Aantal vakken onder het gemiddelde = " + onderGemiddelde);
        return gemiddelde;
    }

    public void voegtoe(Opleidingsonderdeel opleidingsonderdeel) {
        this.lijst.add(opleidingsonderdeel);

    }

    public String overzicht() {
        int bovenGemiddelde = 0;
        int onderGemiddelde = 0;
        int ophetGemiddelde = 0;
        double res = 0;
        String s = "Puntenoverzicht van" + student.getNaam() + "\n";
        for (Opleidingsonderdeel o : this.lijst) {
            s += o.getOmschrijving() + " : " + o.getPunten() + "\n";
            res = res + o.getPunten();
        }
        double gemiddelde = res / lijst.size();
        for (Opleidingsonderdeel opleidingsonderdeel : lijst) {
            if (opleidingsonderdeel.getPunten() > gemiddelde) {
                bovenGemiddelde = bovenGemiddelde + 1;
            } else if ((opleidingsonderdeel.getPunten() > gemiddelde)) {
                onderGemiddelde = onderGemiddelde + 1;
            } else {
                ophetGemiddelde = ophetGemiddelde + 1;
            }
        }
        //System.out.println("Aantal vakken boven het gemiddelde = " + bovenGemiddelde);
        //System.out.println("Aantal vakken onder het gemiddelde = " + onderGemiddelde);
        //binnen een andere klasse kan je een functie van een andere klasse oproepen.
        s += "het gemiddelde van de punten is " + berekenGemiddelde() + "\nAantal vakken boven het gemiddelde: " + bovenGemiddelde + "\nAantal vakken onder het gemiddelde: " + onderGemiddelde;
        return s;
    }





    @Override
    public String toString() {
        return "Rapport{" +
                "student=" + student +
                ", lijst=" + lijst +
                '}';
    }
}
