package Oefeningen;

import java.util.ArrayList;

public class TestKlant {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("Banaan",5);
        Artikel a2 = new Artikel("appelsien", 10);
        Artikel a3 = new Artikel("Nutella 500g", 3);
        Artikel a4 = new Artikel("paprika mixed", 4);
        Klant k1 = new Klant("Dave", "2221");
        Klant k2 = new Klant("Thys","2800");
        Klant k3 = new Klant("Jonas", "9080");
        k1.koop(a1);
        k1.koop(a2);
        k1.koop(a3);
        System.out.println(a1);
        System.out.println(k1);
        System.out.println();
        k1.maakKassaticket();
        //System.out.println();
        //k1.bepaaldGoedkoopste();
        //System.out.println(k1.bepaaldGoedkoopste());
        //System.out.println(k1.print());
        System.out.println(k1.bepaalduurste());

    }


}
