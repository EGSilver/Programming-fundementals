public class Workers {
    private String name;
    private double wage;
    private String zipcode;
    private int age;

    public Workers(String name, double wage, String zipcode, int age) {
        this.name = name;
        this.wage = wage;
        this.zipcode = zipcode;
        this.age = age;
    }

    public void raiseWagePercentage() {

        this.wage = this.wage * 1.01;
    }

    public void raiseWage(double raise) {
        this.wage = this.wage + raise;

    }

    public void print() {
        System.out.println(this.name + " earns €" +this.wage);
    }

}


