public class Bloem {
    private String name;
    private String color;
    private double price;

    public Bloem (String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void print() {
        System.out.println(this.name+" heeft als kleur "+ this.color+" en kost "+ this.price+"€");
    }

    public void manipulatePrice(double amount) {
        this.price = this.price + amount;
    }
}
