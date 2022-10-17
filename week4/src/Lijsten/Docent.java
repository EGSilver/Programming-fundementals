package Lijsten;

import java.util.ArrayList;

public class Docent {
    private String naam;
    //ik maak een object van de klasse ArrayList
    //is steeds een set van objecten
    private ArrayList<Vak> lijst = new ArrayList();


    //maak een constructor zonder de list in de parameter lijst.
    public Docent(String naam) {
        this.naam = naam;
    }

    public int totStudiepunten() {
        int stp = 0;
        for(Vak v : lijst) {
            // stp = stp +
            stp += v.getStudiepunten();
        }
        return stp;
    }

    public void voegVakToe(Vak v) {
        this.lijst.add(v);
    }

    public void print() {
        System.out.println(this.naam + " geeft de vakken");
        //voor elk object Vak van de lijst gaan we de for loop uitvoeren.
        for(Vak v : this.lijst) {
            System.out.println(v.getNaam() + " " + v.getStudiepunten());
        }
    }

    public String overzicht() {
        String s = "Docent" + naam +"geet de vakken: \n";
        for (Vak v : lijst) {
            s = s + v.getNaam()+" "+v.getStudiepunten()+"\n";

        }
        return s;
    }


    @Override
    public String toString() {
        return "Docent{" +
                "naam='" + naam + '\'' +
                ", lijst=" + lijst +
                '}';
    }
}

