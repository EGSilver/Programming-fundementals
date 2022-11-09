package Arraylists.Rapport;

import java.util.ArrayList;

public class Rapport {
    private ArrayList<Vakken> vakkenLijst = new ArrayList<>();
    private Student student;

    public Rapport(Student student) {
        this.student = student;
    }

    public void voegToe(Vakken v) {
        vakkenLijst.add(v);
    }

    public void printPunten() {
        for (Vakken v : vakkenLijst) {
            System.out.println("behaalde voor " + v.getNaam() + " " + v.getPunten());
        }
    }

    public void gemiddelde() {
        int gemiddeldeOnder = 0;
        int gemiddeldeBoven = 0;
        double somPunten = 0;
        double gemiddele = 0;
        for (Vakken v : vakkenLijst) {
            somPunten += v.getPunten();
            gemiddele = somPunten / vakkenLijst.size();
            if (v.getPunten() > gemiddele) {
                gemiddeldeBoven++;
            } else {
                gemiddeldeOnder++;
            }
        }
        System.out.println(gemiddele + "\nAantal vakken boven het gemiddelde: " + gemiddeldeBoven + "\nAantal vakken onder het gemiddelde: " + gemiddeldeOnder);
    }

    public void afwijking () {
        double somPunten = 0;
        double gemiddele = 0;
        double afw = 0;
        for (Vakken v : vakkenLijst) {
            somPunten += v.getPunten();
            gemiddele = somPunten / vakkenLijst.size();
            if (v.getPunten() > gemiddele) {
                afw = v.getPunten() - gemiddele;
                System.out.println(v.getNaam() + " afwijking tegenover het gemiddelde: " + afw);
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
                "vak=" + vakkenLijst +
                ", student=" + student +
                '}';
    }
}
