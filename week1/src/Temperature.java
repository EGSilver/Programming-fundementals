public class Temperature {
    int cels;
    int fahr;
    double res;

    public Temperature(int cels, int fahr) {
        this.cels = cels;
        this.fahr = fahr;
    }

    public Temperature(double res) {
        this.res = res;
    }

    public void convertFahrenheit(int cels, double res) {
        this.res = 1.8 * (double)cels + 32.0;
    }

    public void convertCelsius(int fahr) {

        double res = 1.8 / (double)fahr - 32.0;
        //this.cels = (fahr - 32) / 1.8;
    }

    public void print() { System.out.println("10 celsius = " + this.fahr + " fahrenheit");
    }
}