package Interaction;

public class Line {
    private Point point, endpoint;

    public Line(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double distance() {
        return point.xAndY(this.endpoint);
    }

    @Override
    public String toString() {
        return "Line{" +
                "point=" + point +
                '}';
    }
}





