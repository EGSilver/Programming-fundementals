package Clock2;

public class TestClock {
    public static void main(String[] args) {
        Clock a = new Clock(23,59,59);
        a.raiseMinute();
        System.out.println(a);

    }
}
