public class Klant {
    private String naam;
    private double cashBack;
    private String zipcode;

    public Klant(String naam, double cashBack, String zipcode) {
        this.naam = naam;
        this.cashBack = cashBack;
        this.zipcode = zipcode;
        ;
    }
    //Overloading of constructor.
    //Define constructor with set parameter list.
    //This is an example of a default constructor
    public Klant() {
        this.naam = "Jef";
        this.zipcode = "2800";
        this.cashBack = 2;
    }

    public Klant(String naam, double moneyReturn) {
        this.naam = naam;
        this.cashBack = moneyReturn;
        this.zipcode = "2800";
    }

    //Tegoed met 2% omhoog doen
    public void raiseBy2Percent() {
        this.cashBack = this.cashBack * 1.02;
    }

    public void raiseByPercent(double percentage) {
        this.cashBack = this.cashBack * (1 + percentage);
    }


    // generate toString to be able to print the Object to the console screen.
    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", moneyReturn=" + cashBack +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
