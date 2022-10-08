public class Difference {
    private int number1, number2;

    public Difference(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate() {
        int plus1;
        if (number1 > number2) {
            plus1 = number1 - number2;
        } else {
            plus1 = number2 - number1;
        }
        System.out.println("Het verschil tussen " + number1 + " en " +
                number2 + " = " + plus1);
    }
}
