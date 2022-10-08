package Interaction;

public class TestServant {
    public static void main(String[] args) {
        Department accountancy = new Department("Accountancy", "Antwerpen");
        Department sales = new Department("Sales", "Brussel");
        Servant mieke = new Servant("Mieke", 4000);
        Servant marina = new Servant("Marina", 3000);
        mieke.setDepartment(sales);
        marina.setDepartment(accountancy);
        System.out.println(mieke);
        System.out.println(marina);
        System.out.println();
        mieke.raiseSalary(500);
        marina.raiseSalary(250);
        System.out.println();
        mieke.fetchInfo();
        marina.fetchInfo();
    }
}
