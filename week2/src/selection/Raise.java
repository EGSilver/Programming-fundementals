package selection;

public class Raise {
    private double g1, g2;

    public Raise(double g1, double g2) {
        this.g1 = g1;
        this.g2 = g2;
    }
    public void print() {
    if (g1 < g2) {
        System.out.println(g1 + " " + g2);
    }
    else
    {
        System.out.println(g2 + " " + g1);
    }
    }
}


