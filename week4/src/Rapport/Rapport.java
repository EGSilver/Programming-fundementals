package Rapport;

import java.util.ArrayList;

public class Rapport {
    private Student student;
    private ArrayList<Vak> lijst = new ArrayList<>();

    public Rapport(Student student) {
        this.student = student;
    }

    public void voegtoe(Vak e) {
        this.lijst.add(e);
    }

    public double berekenGemiddelde() {
        int counterBoven = 0;
        int counterOnder = 0;
        int counterOp = 0;
        int gemiddelde = 0;
        for (Vak e : lijst) {
            gemiddelde += e.getPunten();
        }
        gemiddelde = gemiddelde / lijst.size();
        for (Vak e : lijst) {
            if (e.getPunten() > gemiddelde) {
                counterBoven++;
            } else if (e.getPunten() < gemiddelde) {
                counterOnder++;
            } else {
                counterOp++;
            }
        }
        System.out.println(gemiddelde + "\nAantal boven het gemiddelde: " + counterBoven + "\naantal onder gemiddelde: " + counterOnder + "\naantal op gemiddelde " + counterOp);
        return 0;
    }

    public void toonAfwijking() {
        double gemiddelde = 0;
        double som = 0;
        for (Vak e : lijst) {
            gemiddelde += e.getPunten();
        }
        gemiddelde = gemiddelde / lijst.size();
        for (Vak e : lijst) {
            if (e.getPunten() > gemiddelde) {
                som = (gemiddelde - e.getPunten());
                System.out.println("Aantal boven het punten gemiddelde: " + e.getVak() + " " + som);
                System.out.println(e.getPunten());
            } else {
                som = (gemiddelde - e.getPunten());
                System.out.println("Aantal onder het punten gemiddelde: " + e.getVak() + " "  + som);
                System.out.println(e.getPunten());

            }
        }
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Rapport{" +
                "student=" + student +
                ", lijst=" + lijst +
                '}';
    }
}


