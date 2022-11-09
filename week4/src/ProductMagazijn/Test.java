package ProductMagazijn;

public class Test {
    public static void main(String[] args) {
        Product a1 = new Product("Beer",15,10);
        Product a2 = new Product("Hotdogs",20,5);
        Product a3 = new Product("Carrots",50,12);
        Magazijn m = new Magazijn("2800");
        m.voegToe(a1);
        m.voegToe(a2);
        m.voegToe(a3);
        a1.setPrijs(18);
        //m.verhoogPrijzenBP();
        System.out.println(m);
    }
}
