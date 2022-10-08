public class Kast {
    private double height;
    private double width;
    private double depth;

    public Kast() {
        this.height = 117;
        this.width = 69;
        this.depth = 43;
    }

    public Kast(double height, double width) {
        this.height = height;
        this.width = width;
        this.depth = 30;
}
    public Kast(double height, double width, double depth  ) {
        this.height = 10;
        this.width = 10;
        this.depth = 10;
    }

    @Override
    public String toString() {
        return "Kast{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
    public void print() {
        System.out.println("de kast is \nbreedte : "+this.width + "\nhoogte: "+this.height+"\ndiepte: "+this.depth);
    }
}
