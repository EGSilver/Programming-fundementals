package Oefeningen2;

public class TestTicket {
    public static void main(String[] args) {
        Artikel a = new Artikel("Selder",2);
        Artikel b = new Artikel("Brood", 4);
        Artikel c = new Artikel("Choco",4);
        Klant k1 = new Klant("Dré","2800");
        Klant k2 = new Klant("Staf","2000");
        k1.koopArtikel(a);
        k1.koopArtikel(b);
        k1.koopArtikel(b);
        k2.koopArtikel(a);
        k1.koopArtikel(c);
        k1.koopArtikel(c);
        System.out.println();
        System.out.println(k1);
        System.out.println();
        System.out.println(k2);
        System.out.println();
        k1.maakKassaTicket();
        System.out.println();
        System.out.println();
        System.out.println(k1.print());
        k1.print();
        System.out.println(k1.bepaalGrootste());
        System.out.println(k1.bepaalKleinste());
    }
}
