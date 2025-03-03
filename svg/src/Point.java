import java.util.Locale;

public class Point {
    public double x;
    public double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public String toSvg() {
        return String.format(Locale.ENGLISH, "<circle r=\"45\" cx=\"%.1f\" cy=\"%.1f\" fill=\"red\" />", this.x, this.y);
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public Point translated(double dx, double dy) {
        Point translatedPoint = new Point();
        translatedPoint.x = this.x + dx;
        translatedPoint.y = this.y + dy;

        return translatedPoint;
    }
}
