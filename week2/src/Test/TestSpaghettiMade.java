package Test;

public class TestSpaghettiMade {
    public static void main(String[] args) {
        SpaghettiMade s1 = new SpaghettiMade("Bolognaise",17,2,12);
        SpaghettiMade s2 = new SpaghettiMade("carbonara",18);
        System.out.println("\noutput vraag 4:");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println("\noutput vraag 5:");
        System.out.println(s1.totaalPrijs(5));
        System.out.println(s2.totaalPrijs(5));
        System.out.println("\noutput vraag 6:");
        s1.beschrijf();
        s2.beschrijf();
        System.out.println("\noutput vraag 7:");
        s1.totaalAlles(10,true,true);
        s1.totaalAlles(10,false,false);
        s1.totaalAlles(10,true,false);
        s1.totaalAlles(10,false,true);
        System.out.println("output vraag 8:");
        System.out.println(s1.toString());
        s1.indexeer();
        System.out.println(s1.toString());
    }
}