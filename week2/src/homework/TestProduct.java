package homework;

public class TestProduct {
    public static void main(String[] args) {
        Product a = new Product("Dorpel",18.1,1.21,0.06);
        Product c = new Product("Dorpel",18.1);
        Product b = new Product("baksteen",2.25);
        c.Ticket(10,true);
        //b.Ticket(10,false);
        //a.Ticket(10 , false);

    }
}
