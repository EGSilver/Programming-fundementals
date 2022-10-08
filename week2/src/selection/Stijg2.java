package selection;

public class Stijg2 {

    public Stijg2() {
    }

    public void SortUp(double num1, double num2, double num3) {
        if (num1 < num2 && num2 < num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 > num2 && num2 < num3 && num3 > num1) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num1 > num2 && num2 < num3 && num3 < num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num1 < num2 && num2 > num3 && num1 < num3) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num1 < num2 && num2 > num3 && num1 > num3) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num1 > num2 && num2 > num3) {
            System.out.println(num3 + " " + num2 + " " + num1);
        } else System.out.println("Error");

    }
}

/*    public void SortUp1(double num1, double num2, double num3) {
        if (num1 < num2)
            if (num2 < num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else if (num1 < num3) {
                System.out.println(num1 + " " + num3 + " " + num2);
            } else System.out.println(num3 + " " + num1 + " " + num2);
        else if (num2 < num3) {
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if (num1 < num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else System.out.println(num2 + " " + num3 + " " + num1);
    }
}*/
