package Lijsten;

public class TestVak {
    public static void main(String[] args) {
        Vak v1 = new Vak("Java", 8);
        Vak v2 = new Vak("SQL",4);
        Vak v3 = new Vak("HTML",4);
        Docent d1 = new Docent("Peeters");
        Docent d2 = new Docent("Janssens");
        System.out.println(d1);
        System.out.println(d2);
        d1.voegVakToe(v1);
        d1.voegVakToe(v2);
        d2.voegVakToe(v2);
        d2.voegVakToe(v3);
        d1.print();
        d2.print();
        System.out.println(d1.totStudiepunten());


    }
}
