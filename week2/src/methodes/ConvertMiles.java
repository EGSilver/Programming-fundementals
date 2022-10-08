package methodes;

public class ConvertMiles {
    private double mile;


    public ConvertMiles(double mile) {

        this.mile = mile;
    }

    public void Convert() {
        //this.mile = this.mile * 1.609244;
        this.mile *= 1.609244;
    }


    public void print() {
        // System.out.println("30 mijl = "+this.mile+ " kilometers. "+"\n50.0 mijl = "+this.mile+" kilometers. "+"\n160 mijl = "+this.mile+" kilometers. ");
        System.out.println("30 mile = " + this.mile + " kilometer.");
    }

    public void print2() {
        // System.out.println("30 mijl = "+this.mile+ " kilometers. "+"\n 50.0 mijl = "+this.mile+" kilometers. "+"\n 160 mijl = "+this.mile+" kilometers. ");
        System.out.println("50 mile = " + this.mile + " kilometer.");
    }

    public void print3() {
        // System.out.println("30 mijl = "+this.mile+ " kilometers. "+"\n 50.0 mijl = "+this.mile+" kilometers. "+"\n 160 mijl = "+this.mile+" kilometers. ");
        System.out.println("100 mile = " + this.mile + " kilometer.");
    }
}

