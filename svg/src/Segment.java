public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public double length() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1.x = " + p1.getX() +
                ", p1.y = " + p1.getY() +
                ", p2.x = " + p2.getX() +
                ", p2.y = " + p2.getY() +
                '}';
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public static Segment longest_segment(Segment[] segments) {
        double max = segments[0].length();
        int index = 0;
        for (int i = 0; i < segments.length; i++) {
            if (segments[i].length() > max) {
                max = segments[i].length();
                index = i;
            }
        }



        return segments[index];
    }
}
