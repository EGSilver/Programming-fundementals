package HomeWork;

public class TestPoint {
    public static void main(String[] args) {
        Point a = new Point(20,20);
        Point b = new Point(35,35);
        Point c = new Point(300,480);
        Line l1 = new Line(a,b);
        Line l2 = new Line(b,c);
        Line l3 = new Line(a,c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        //a.distanceTo(b);
        //b.distanceTo(c);
        //c.distanceTo(a);
        System.out.println(a.distanceTo(b));
        System.out.println(b.distanceTo(c));
        System.out.println(a.distanceTo(c));
    }
}
