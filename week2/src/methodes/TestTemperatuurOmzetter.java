package methodes;

public class TestTemperatuurOmzetter {
    public static void main(String[] args) {
        ConvertTemperature a = new ConvertTemperature(50,10);
        a.toCelsius();
        a.toFahrenheit();
        System.out.println(a);
    }

}
