package homework;

public class Bmi {
    private double length, weight;

    public Bmi() {
        this.length = 1.60;
        this.weight = 86;
    }

    public Bmi(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void calculateBmi() {
       double bmi = (this.weight / (this.length * this.length));
        System.out.println(bmi);
    }

    public void sortCategory() {
        double bmi = (this.weight / (this.length * this.length)); {
            if (bmi > 25) {
                System.out.println("BMI is to high");
            } else if (bmi < 20) {
                System.out.println("BMI is to low");
            } else System.out.println(("BMI is good"));
        }
    }

}

