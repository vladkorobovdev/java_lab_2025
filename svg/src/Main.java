public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5.0;
        p.y = 7.5;

        System.out.println(p.toSvg());

        Point p2 = p.translated(4.0, 3.0);
        System.out.println(p);
        System.out.println(p2);

        Segment s = new Segment();
        s.p1 = p;
        s.p2 = p2;
        System.out.println(s.length());
    }
}
