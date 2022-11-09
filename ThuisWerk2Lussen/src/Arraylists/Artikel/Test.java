package Arraylists.Artikel;

public class Test {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("banaan",8);
        Artikel a2 = new Artikel("soep",2);
        Artikel a3 = new Artikel("patat",8);
        Artikel a4 = new Artikel("bloem",5);
        Klant k1 = new Klant("Dre","2800");
        System.out.println();
        k1.koop(a1);
        k1.koop(a2);
        k1.koop(a3);
        k1.koop(a4);
        k1.maakKassaTicket();
        System.out.println();
        System.out.println("**Print String**");
        System.out.println();
        System.out.println(k1.print());
        System.out.println();
        System.out.println("bepaalGoedkooptste");
        //System.out.println(k1.bepaalGoedkooptste());
        System.out.println();
        System.out.println("bepaalGrootste");
        System.out.println(k1.bepaalGrootsteA());
    }
}
