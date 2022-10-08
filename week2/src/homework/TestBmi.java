package homework;

public class TestBmi {
    public static void main(String[] args) {
        Bmi a = new Bmi(1.59, 86);
        Bmi b = new Bmi(1.75, 75);
        Bmi c = new Bmi(1.51, 55);
        Bmi d = new Bmi(1.55, 62);
        //Bmi b = new Bmi(58, 18);
        a.calculateBmi();
        b.calculateBmi();
        c.calculateBmi();
        d.calculateBmi();
        a.sortCategory();
        b.sortCategory();
        c.sortCategory();
        d.sortCategory();



    }
}
