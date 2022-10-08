package Clock;

public class TestDigitalClock {
    public static void main(String[] args) {
        DigitalClock a = new DigitalClock(23,59,59);
        a.raiseHour();
        a.raiseSecond();
        System.out.println(a);
    }
}
