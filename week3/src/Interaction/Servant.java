package Interaction;

public class Servant {
    private String name;
    private double salary;
    private Department department;

    public Servant(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double raiseSalary(double raise) {
        double res = (this.salary * 0.10);
        if (raise > res) {
            this.salary = (this.salary * 1.10);
            System.out.println("Error, raise cannot be larger then 10% - Salary has been raised by 10%");
        } else this.salary = (this.salary + raise);
        return this.salary;
    }

    // public void verhoogSal(double bedrag) {
    // if (this.salaris + bedrag <= this.salaris*1.1)
    // } else {
    // this.salaris *=1.1
    // }

    public void fetchInfo() {
        System.out.println(name + " verdient " + this.salary + " en is werkzaam in " + department.getName() + " op de locatie " + department.getLocation());
    }

    @Override
    public String toString() {
        return this.name + " verdient " + this.salary + " is werkzaam in " + this.department.getName() + "op de locatie " + this.department.getLocation();
    }
}
