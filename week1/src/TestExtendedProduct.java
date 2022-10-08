
public class TestExtendedProduct {
    public static void main(String[] args) {
        ExtendedProduct a = new ExtendedProduct("dorpel", 18.1);
        ExtendedProduct b = new ExtendedProduct("baksteen");
        ExtendedProduct c = new ExtendedProduct("glazen bouwteen", 6.06);

        System.out.println();
        System.out.println("Test kassaticket");
        System.out.println("-----------------------");
        a.ticket(10,false);
        b.ticket(0, false);
        System.out.println();
        System.out.println("Test prijs in solden");
        System.out.println("-----------------------");
        //a.prijsSolden(0.2);
        //c.prijsSolden(0.3);
        //b.prijsSolden(0.2);
        System.out.println();
        System.out.println("Test prijsverhoging");
        System.out.println("-----------------------");
        //b.prijsverhoging(0.1);
        System.out.println();
        System.out.println("Test te betalen");
        System.out.println("-----------------------");
        //System.out.println(b.teBetalen(5));
    }
}
