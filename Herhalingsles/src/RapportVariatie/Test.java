package RapportVariatie;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Jan");
        Vak v1 = new Vak("Java",6);
        Vak v2 = new Vak("Webdesign", 6);
        Vak v3 = new Vak("SQL",3);
        Rapport r1 = new Rapport(s1);
        r1.geefPunten(v1, 12);
        r1.geefPunten(v2, 14);
        r1.geefPunten(v3, 17);
        System.out.println(r1);
        System.out.println(r1.gemiddelde());
        System.out.println();
        System.out.println(r1.overzicht());
        System.out.println(r1);
        r1.pasPuntenAan(0.10);
        System.out.println(r1);
    }
}


//72
//84 51