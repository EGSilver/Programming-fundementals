public class Programmer {
    private String profession;
    private String name;
    private double salary;

    public Programmer(String profession, String name, double salary) {
        this.profession = profession;
        this.name = name;
        this.salary = salary;

    }

    public void verhoogSalProcent() {

        this.salary = this.salary * 1.01;
    }
    public void verhoogSalBedrag(double raise) {

        this.salary = this.salary + raise;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

