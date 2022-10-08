package selection;

public class TestCalculate {
    public static void main(String[] args) {
        Calculate a = new Calculate(5,23,'+');
        Calculate b = new Calculate(7894,56,'/');
        a.CalculateandPrint();
        b.CalculateandPrint();
    }
}
