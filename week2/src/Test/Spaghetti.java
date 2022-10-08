package Test;

public class Spaghetti {
    private String name;
    private double basePrice, supplementcheese, supplementWine;

    public Spaghetti(String name, double basePrice, double supplementcheese, double supplementWine) {
        this.name = name;
        this.basePrice = basePrice;
        this.supplementcheese = supplementcheese;
        this.supplementWine = supplementWine;
    }

    public void totalPrice(int amount) {
        System.out.println("Total price = " + this.basePrice * amount);
    }

    public void calculatePrice(int amount, boolean cheese, boolean wine) {
        double totalPrice = (this.basePrice * amount);
        double totalPriceCheese = (this.supplementcheese * amount);
        double totalPriceWine = (this.supplementWine * amount);
        double pricePlusCheese = (totalPrice + totalPriceCheese);
        double pricePlusWine = (totalPrice + totalPriceWine);
        double all = (totalPrice + totalPriceWine + totalPriceCheese);
        if (cheese) {
            if (wine == false) {
                System.out.println("de totaalprijs van " + amount + " spaghetti met kaas = " + pricePlusCheese);
            }
        }
        if (cheese == false) {
            if (wine) {
                System.out.println("de totaalprijs van " + amount + " spaghetti & wijn = " + pricePlusWine);
            }
        }
        if (cheese == true && wine == true) {
            System.out.println("de totaalprijs van " + amount + " spaghetti met kaas & wijn = " + pricePlusWine);
        }
        else {
            System.out.println(all);
        }

    }

}
