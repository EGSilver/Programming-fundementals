public class Person {
    private String name;
    private String surname;
    private String address;

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;

    }

    public void print() {
        System.out.println(this.name + " " + this.surname + " woont in " + this.address + ".");

    }

}


