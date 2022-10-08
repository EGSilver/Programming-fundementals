package HomeWork;

public class Line {
    private Point startingPoint;
    private Point endPoint;

    public Line(Point startingPoint, Point endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public double distance() {
        return startingPoint.distanceTo(this.endPoint);
    }

    public Point getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Point startingPoint) {
        this.startingPoint = startingPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "startingPoint=" + startingPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
