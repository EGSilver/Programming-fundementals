package Expressions;

public class TestMilesToKilometers {
    public static void main(String[] args) {
        MilesToKilometers m = new MilesToKilometers(30);
        MilesToKilometers m2 = new MilesToKilometers(50);
        MilesToKilometers m3 = new MilesToKilometers(100);
        m.Convert();
        m2.Convert();
        m3.Convert();
        m.print();
        m2.print2();
        m3.print3();
    }
}
