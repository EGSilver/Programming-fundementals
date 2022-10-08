public class Bread {
    private String sort;
    private String shape;
    private double  price;

    public Bread(String sort, String shape, double price) {

        this.sort = sort;
        this.shape = shape;
        this.price = price;

    }

    public void print() {
        System.out.println("This bread is " + this.sort + ", " + this.shape + " and costs " + this.price + " ");
    }

}
