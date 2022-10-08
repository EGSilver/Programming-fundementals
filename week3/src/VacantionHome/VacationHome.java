package VacantionHome;

public class VacationHome {
    private double pricePerWeek;
    private double discountWeek2;
    private double discountWeek3;
    private double maxPeople;
    private double municipalTax;
    private double touristTax;

    public VacationHome(double pricePerWeek, double discountWeek2, double discountWeek3, double maxPeople, double municipalTax, double touristTax) {
        this.pricePerWeek = pricePerWeek;
        this.discountWeek2 = discountWeek2;
        this.discountWeek3 = discountWeek3;
        this.maxPeople = maxPeople;
        this.municipalTax = municipalTax;
        this.touristTax = touristTax;
    }

    //public double return (double persons double price)

    @Override
    public String toString() {
        return "VacationHome{" +
                "pricePerWeek=" + pricePerWeek +
                ", discountWeek2=" + discountWeek2 +
                ", discountWeek3=" + discountWeek3 +
                ", maxPeople=" + maxPeople +
                ", municipalTax=" + municipalTax +
                ", touristTax=" + touristTax +
                '}';
    }
}

