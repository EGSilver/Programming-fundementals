package selection;

public class Calculate {
    private double number1, number2;
    private char bewerking;

    public Calculate(double number1, double number2, char bewerking) {
        this.number1 = number1;
        this.number2 = number2;
        this.bewerking = bewerking;
    }

    public void CalculateandPrint() {
        if (bewerking == '+') {
            System.out.println(this.number1 + "+" + number2 + "=" + (number1 + number2));
        }
       else if (bewerking == '-') {
            System.out.println(this.number1 + "-" + number2 + "=" + (number1 - number2));
        }
        if (bewerking == '*') {
            System.out.println(this.number1 + "*" + number2 + "=" + (number1 * number2));
        }
        if (bewerking == '/') {
            System.out.println(this.number1 + "/" + number2 + "=" + (number1 / number2));
        }
    }
}
