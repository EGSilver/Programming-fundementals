package Interaction;

public class TestPoint {
    public static void main(String[] args) {
        Point a = new Point(80,40);
        a.xAndY(a);
        System.out.println(a.xAndY(a));
        Line l1 = new Line(a);
        System.out.println(a.xAndY(a));

    }
}
