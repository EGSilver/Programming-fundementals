package Page45;

public class TestProduct {
    public static void main(String[] args) {
        Product a = new Product("dorpel", 18.1);
        Product b = new Product("baksteen");
        Product c = new Product("glazen bouwteen", 6.06);

        System.out.println();
        System.out.println("Test kassaticket");
        System.out.println("-----------------------");
        a.ticket(10,true);
        b.ticket(15, true);
        System.out.println();
        System.out.println("Test prijs in solden");
        System.out.println("-----------------------");
        a.blackFriday(0.2);
        c.blackFridayRaise(0.3);
        //b.blackFriday(0.2);
        System.out.println();
        System.out.println("Test prijsverhoging");
        System.out.println("-----------------------");
        //b.blackFriday(0.1);
        System.out.println(a);
        System.out.println("Test te betalen");
        System.out.println("-----------------------");
        //System.out.println(b.teBetalen(5));
    }
}