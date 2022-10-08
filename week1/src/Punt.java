public class Punt {
    private double x;
    private double y;

    public Punt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punt() {
        this.x = 0.0;
        this.y = 0.0;
    }


    public void print() {
        System.out.println(this.x + ","+ this.y);
    }

}

