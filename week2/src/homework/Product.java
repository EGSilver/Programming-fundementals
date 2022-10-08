package homework;

import java.sql.SQLData;
import java.sql.SQLOutput;

public class Product {
    private String name;
    private double price;
    private double percentageTax;
    private final double SHIPPING_COST = 3.5;
    private double discountPercentage;

    public Product(String name, double price, double percentageTax, double discountPercentage) {
        this.name = name;
        this.price = price;
        this.percentageTax = percentageTax;
        this.discountPercentage = discountPercentage;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discountPercentage = 0.06;
        this.percentageTax = 1.21;
    }

    public void Ticket(double amountbought, boolean shippingcost) {
        double total = (amountbought * price * this.percentageTax);
        double a = total - (total * this.discountPercentage);
        {
            System.out.println("total cost = " + a);
        }

        if (shippingcost)
        {
            System.out.println("shippingcost = " + SHIPPING_COST + "€");
        }
    }
}


