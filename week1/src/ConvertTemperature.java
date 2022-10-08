public class ConvertTemperature {
    private double fahr;
    private double cels;

    public ConvertTemperature(double fahr, double cels) {
        this.fahr = fahr;
        this.cels = cels;
    }

    public void toFahrenheit() {
        this.fahr = 1.8 * this.cels + 32;

    }

    public void toCelsius() {
        this.cels = (this.fahr -32) / 1.8;
    }

    public void print() {
        System.out.println(this.cels+" celsius = "+this.fahr+" fahrenheit.");
    }
    public void print2() {
        System.out.println(this.fahr + " fahrenheit = " + this.cels+" celsius.");
    }

    @Override
    public String toString() {
        return "ConvertTemperature{" +
                "fahr=" + fahr +
                ", cels=" + cels +
                '}';
    }
}