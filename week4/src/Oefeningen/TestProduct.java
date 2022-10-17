package Oefeningen;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Banaan",0,5);
        Product p2 = new Product("Cote d'or choco",0,4.5);
        Product p3 = new Product("Cuberdons",0,2.5);
        Magazijn m1 = new Magazijn("2800");
        Magazijn m2 = new Magazijn("2221");
        //p1.verhoogPrijs(0.1);
        //p1.setPrijs(2.8);
        m1.voegProductToe(p1);
        m1.voegProductToe(p2);
        m1.voegProductToe(p3);
        //System.out.println(m2);
        System.out.println(m1);
        System.out.println(m1.overzichtString());
        System.out.println(m2.overzichtString());
        m1.verhoogPrijzen50();
        System.out.println(m1);
        System.out.println();
        //m1.ToonLageVoorraad();
        //m2.ToonLageVoorraad();
        System.out.println(m1.bestellingLeverancier());


    }
}
