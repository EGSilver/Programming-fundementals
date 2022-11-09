package Oefeningen2;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product("Banaan",5,3);
        Product p2 = new Product("Kiwi",0,5);
        Product p3 = new Product("Druif",9,1);
        Magazijn m1 = new Magazijn("2860");
        m1.voegProductToe(p1);
        m1.voegProductToe(p2);
        m1.voegProductToe(p3);
        //p1.verhoogPrijs(100);
        //p1.setPrijs(2.6);
        System.out.println(p1.getPrijs());
        System.out.println();
        System.out.println(p1);
        System.out.println();
        System.out.println("***voor de prijsverhoging***");
        System.out.println(m1);
        System.out.println();
        m1.verhoogPrijs50();
        System.out.println();
        System.out.println("***na de prijsverhoging***");
        System.out.println(m1);
        m1.checkVoorrraad();


    }
}
