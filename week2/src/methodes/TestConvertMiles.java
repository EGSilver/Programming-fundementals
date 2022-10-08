package methodes;

public class TestConvertMiles {
    public static void main(String[] args) {
        methodes.ConvertMiles m = new methodes.ConvertMiles(30);
        methodes.ConvertMiles m2 = new methodes.ConvertMiles(50);
        methodes.ConvertMiles m3 = new methodes.ConvertMiles(100);
        m.Convert();
        m2.Convert();
        m3.Convert();
        m.print();
        m2.print2();
        m3.print3();
    }
}
