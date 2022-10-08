package Clock;

public class Counter {
    private int number, max;

    public Counter(int number, int max) {
        this.number = number;
        this.max = max;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "number=" + number +
                ", max=" + max +
                '}';
    }
}
