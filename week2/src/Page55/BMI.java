package Page55;

import javax.print.DocFlavor;

public class BMI {
    private double gewicht, groote;

    public BMI(double gewicht, double groote) {
        this.gewicht = gewicht;
        this.groote = groote;
    }

    public BMI() {
        this.gewicht = 50;
        this.groote = 1.60;
    }

    public double calculateBmi() {
        //BMI=(gewicht in kg)/((grootte in m)*(grootte in m))
        double total = gewicht / (groote * groote);
        {
            return total;
        }
    }
    public String calculateCategory(double bmi) {
        if (bmi > 25) {
            System.out.println("BMI To High");
        } else if (bmi < 20) {
            System.out.println("BMI To Low");
        } else if (bmi > 20 && bmi < 25); {
            System.out.println("BMI is good");
        }
        return "error";
     }
}

