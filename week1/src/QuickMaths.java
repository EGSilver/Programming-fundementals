public class QuickMaths {
    private String name;
    private double salary;

    public QuickMaths(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raisePercent() {
        this.salary = this.salary * 1.01;
    }

    public void raiseSalary(double raise) {
        this.salary = this.salary + raise;
    }

    public void print() {
        System.out.println(this.name + " earns " + this.salary);
    }
}
