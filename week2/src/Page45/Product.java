package Page45;

import javax.swing.*;

public class Product {
    private String name;
    private double price;
    private final double SHIPPINGCOST = 3.5;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    //Indien dit een Boolean test je of die op true of false staat
    public void ticket(int amountbought, boolean shipping) {
        double res = amountbought * this.price;
        {
            if (amountbought > 0) ;
            {
                System.out.println(amountbought + " " + this.name + "*" + " " + res);
            }
        }
        if (shipping) {
            System.out.println("Verzendkosten = " + SHIPPINGCOST);

        } else System.out.println("totaal = €" + (res + SHIPPINGCOST));
        {
        }


    }

    public void blackFriday(double percent) {
        double total = this.price - this.price * percent;
        {
        }
        if (this.price <= 0) {
            System.out.println("prijs is nog niet toegekend, korting is hier niet mogelijk");
            System.out.println("nieuwe prijs voor baksteen =" + this.name + " is 0€ ");
        } else if (this.price <= 10) {
            System.out.println("de korting tijdens de solden is bij prijzen kleiner dan of gelijk aan 10 € altijd 50% ");
            System.out.println("de nieuwe prijs is" + (price * 0.5));
        } else {
            System.out.println("de nieuwe prijs is " + total + "€");

        }
    }

    public void blackFridayRaise(double raisePercentage) {
        this.price = this.price + this.price * raisePercentage;
        //System.out.println(this.price);
    }

    public void blackFridayRaise() {
        this.price = this.price * 1.1;
    }

    public double ToPay(int amount) {
        return price * amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", SHIPPINGCOST=" + SHIPPINGCOST +
                '}';
    }
}
