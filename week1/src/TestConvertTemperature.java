public class TestConvertTemperature {

    public static void main(String[] args) {
        ConvertTemperature cels = new ConvertTemperature(0, 10);
        ConvertTemperature fahr = new ConvertTemperature(50,0);
        cels.toFahrenheit();
        cels.print();
        System.out.println(cels);
        fahr.toCelsius();
        fahr.print2();
        System.out.println(fahr);

    }

}
