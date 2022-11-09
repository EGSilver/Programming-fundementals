package Rapport2;

import java.util.ArrayList;

public class Rapport {
    private Student student;
    private ArrayList<Vak> lijst = new ArrayList<>();

    public void voegToe(Vak v) {
        this.lijst.add(v);
    }

    public void berekenGemiddelde() {
        int counterUp = 0;
        int counterDown = 0;
        double gemiddelde;
        int counter = 0;
        double sum = 0;
        for (Vak v : lijst) {
            sum += v.getPunten();
            counter++;
        }
        gemiddelde = sum / lijst.size();
        System.out.println(gemiddelde);
        for (Vak v : lijst) {
            if (v.getPunten() > gemiddelde) {
                counterUp++;
            } else if (v.getPunten() < gemiddelde) {
                counterDown++;
            }
        }
        System.out.println("Aantal boven het gemiddelde " + counterUp +"\nAantal onder gemidddelde " + counterDown);
    }


    public Rapport(Student student) {
        this.student = student;
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
