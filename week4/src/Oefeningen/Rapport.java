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
        System.out.println("Aantal vakken boven het gemiddelde = " + bovenGemiddelde);
        System.out.println("Aantal vakken onder het gemiddelde = " + onderGemiddelde);
        return gemiddelde;
    }

    public void voegtoe(Opleidingsonderdeel opleidingsonderdeel) {
        this.lijst.add(opleidingsonderdeel);

    }

    @Override
    public String toString() {
        return "Rapport{" +
                "student=" + student +
                ", lijst=" + lijst +
                '}';
    }
}
