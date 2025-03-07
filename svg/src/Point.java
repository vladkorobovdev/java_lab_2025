import java.util.Locale;

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point oldP) { // constructor for deep copy
        this.x = oldP.x;
        this.y = oldP.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

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
