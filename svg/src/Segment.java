public class Segment {
    public Point p1 = new Point();
    public Point p2 = new Point();

    public double length() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
