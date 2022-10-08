public class TestKlant {
    public static void main(String[] args) {
        Klant klant1 = new Klant ("Jan", 100, "2800");
        Klant klant2 = new Klant ("Joske", 20, "3000");
        Klant klant3 = new Klant();
        Klant klant4 = new Klant("Dave", 5);
        System.out.println(klant1);
        System.out.println(klant2);
        klant2.raiseBy2Percent();
        System.out.println(klant2);
        klant2.raiseByPercent(0.05);
        System.out.println(klant2);
        System.out.println(klant3);
        System.out.println(klant4);
    }
}
