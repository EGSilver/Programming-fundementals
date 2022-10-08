package methodes;

public class TemperatuurOmzetter {

    public TemperatuurOmzetter() {

    }

    public void naarFahrenheit(int cels) {
        if (cels > 19) {
            double res;
            res = 1.8 * cels + 32;
        } else {
            System.out.println("Nicely done!");
        }
    }

    public void naarCelsius(int fahr) {
        double cels;
        cels = (fahr -32) / 1.8;


    }
    public void print() {
        System.out.println();
    }
}