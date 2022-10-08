package Clock2;

public class Counter {
 private int number, maxNumber;

    public Counter(int number, int maxNumber) {
        this.number = number;
        this.maxNumber = maxNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "number=" + number +
                ", maxNumber=" + maxNumber +
                '}';
    }
}
