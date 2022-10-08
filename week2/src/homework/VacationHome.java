package homework;

public class VacationHome {
    private double pricePerWeek;
    private double discountWeek2;
    private double discountWeek3;
    private double maxPeople;
    private final double MUNICIPAL_TAX = 1.1;
    private double touristTax;


    public VacationHome(double pricePerWeek, double discountWeek1, double discountWeek2, double maxPeople, double touristTax) {
        this.pricePerWeek = pricePerWeek;
        this.discountWeek2 = discountWeek2;
        this.discountWeek3 = discountWeek3;
        this.maxPeople = maxPeople;
        this.touristTax = touristTax;
    }

/*    public double bookHome(double persons, double weeksBooked) {
        double total = 0;
        if (persons > maxPeople) {
            System.out.println("You exceeded the maximum amount of people allowed in the vacation home.");
        } else if (weeksBooked < 2) {
            total =  ((weeksBooked * pricePerWeek) + (persons * touristTax * weeksBooked)) * municipalTax;
            System.out.println("You have booked the vacation home for " + weeksBooked + " week(s). We hope you enjoy your stay.");
            System.out.println("Total amount to pay: " + total + "€" + "\nTourist tax included " + touristTax + "€/pp/pw");
        } else if (weeksBooked >= 2 && weeksBooked < 3) {
            total  = (pricePerWeek + (pricePerWeek - (pricePerWeek * discountWeek1)) + (persons * touristTax * weeksBooked)) * municipalTax;
            System.out.println("You have booked the vacation home for " + weeksBooked + " week(s). We hope you enjoy your stay.");
            System.out.println("Total amount to pay: " + total + "€");
        } else {               //750                             30                              37.5
            total = ((weeksBooked * pricePerWeek) - (pricePerWeek * discountWeek1) - (pricePerWeek * discountWeek2 * (weeksBooked - 2)) + (persons * touristTax * weeksBooked)) * municipalTax;
            System.out.println("You have booked the vacation home for " + weeksBooked + " week(s). We hope you enjoy your stay.");
            System.out.println("Total amount to pay: " + total + "€");
        }
        return total;
    }*/

    public double bookHome(double persons, double weeksBooked) {
        double total = this.pricePerWeek;
        if (persons > maxPeople) {
            System.out.println("Error house cannot be booked for more then " + maxPeople + ".");
        }
        else if (weeksBooked >= 2) {
           double total2 = pricePerWeek + pricePerWeek - (pricePerWeek * discountWeek2) + (persons * touristTax * weeksBooked) * MUNICIPAL_TAX;
            System.out.println("You have booked the vacation home for " + weeksBooked + " the total amount to pay is " + total2);
        }
        else if (weeksBooked >=3) {
            double total3 = ((weeksBooked * pricePerWeek) - (pricePerWeek * discountWeek3) - (pricePerWeek * discountWeek2 * (weeksBooked - 2)) + (persons * touristTax * weeksBooked)) * MUNICIPAL_TAX;
            System.out.println("You have booked the vacation home for " + weeksBooked + " the total amount to pay is " + total3);
        } else
           // double total1 = (pricePerWeek + persons * touristTax * weeksBooked) * MUNICIPAL_TAX;
            System.out.println();

        return total;
    }

    public void index() {
        this.pricePerWeek *= 1.02;
        this.discountWeek2 *= 1.02;
        this.discountWeek3 *= 1.02;
    }

    @Override
    public String toString() {
        return "VacationHome{" +
                "pricePerWeek=" + pricePerWeek +
                ", discountWeek1=" + discountWeek2 +
                ", discountWeek2=" + discountWeek3 +
                '}';
    }
}


