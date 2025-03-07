import java.util.Arrays;

public class SvgScene {
    private int index = 0;
    private Polygon[] polygons = new Polygon[3];

    public void addPolygon(Polygon polygon) {
//        if (index >= polygons.length) {
//            this.index = 0;
//            this.polygons[index] = polygon;
//            this.index++;
//        }
//        else {
//            this.polygons[index] = polygon;
//            this.index++;
//        }
        polygons[(index++) % 3] = polygon;
    }

    @Override
    public String toString() {
        return "SvgScene{" +
                "index=" + index +
                ", polygons=" + Arrays.toString(polygons) +
                '}';
    }

    public String toSvg() {
        StringBuilder result = new StringBuilder();
        result.append("<svg xmlns=\"http://www.w3.org/2000/svg\">");
        for (var polygon : this.polygons) {
            result.append("\n\t");
            result.append(polygon.toSvg());
        }
        result.append("\n</svg>");
        return result.toString();
    }
}