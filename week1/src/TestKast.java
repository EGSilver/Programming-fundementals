public class TestKast {
    public static void main(String[] args) {
        Kast kast1 = new Kast (117, 69, 43);
        Kast kast2 = new Kast ();
        Kast kast3 = new Kast(147, 47);
        System.out.println(kast1);
        System.out.println(kast2);
        System.out.println(kast3);
        kast1.print();
        kast2.print();
        kast3.print();

    }
}
