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
}
