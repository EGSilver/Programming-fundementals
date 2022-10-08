public class ExtendedProduct {
    String name;
    double price;
    double shippingcost = 3.5;

    public ExtendedProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ExtendedProduct(String name) {

        this.name = name;
    }

    public void ticket(int amountbought, boolean shipping) {
        double res = amountbought * this.price;
        double total = res + res;
        if (amountbought > 0) {
            System.out.println(amountbought + "*" + this.name + "= " + "€" + res);
            if (total > 0) {
                System.out.println(res);
            }
            if (shipping == true) {
                System.out.println("verzendkosten = " + shippingcost);
            }

        } else System.out.println("Amount bought is 0");
        //"\n" + "+ verzendkosten = " + this.shippingcost + "\n" + "totaal " + total)

        }
    //public void prijsverhoging(double reserved) {
      //  reserved = amountbought * this.price;

}

        /*System.out.println("verzendingskosten "+ this.shippingcost);
        System.out.println("totaal = " + total);*/




        /*    if (shipping == true) {
                    System.out.println("verzendkosten = " + shippingcost);
                    }*/