import java.util.Arrays;
import java.util.Locale;

public class Polygon {
    private Point[] points;

//    public Polygon(Point[] points) {
//        this.points = points;
//    }

//    public Polygon(Point[] points) {
//        int length = points.length;
//        this.points = new Point[length];
//        for (int i = 0; i < length; i++) {
//            this.points[i] = points[i];
//        }
//    }

    public Polygon(Point[] points) {
        int length = points.length;
        this.points = new Point[length];
        for (int i = 0; i < length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    public String toSvg() {
        StringBuilder pointsString = new StringBuilder();  // String is immutable, that's why we use string builder which is mutable (all of optimization)
        for (Point p : points) {
            pointsString.append(p.getX() + "," + p.getY() + " ");
        }
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\" style=\"fill:lime;stroke:purple;stroke-width:3\" />", pointsString);
    }
}
