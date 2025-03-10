public class Main {
    public static void main(String[] args) {
        // oldCode();
        // polygons();
        scene();
    }

    public static void oldCode() {
        //        Point p = new Point();
        //        p.x = 5.0;
        //        p.y = 7.5;

        Point p = new Point(5.0, 7.5);

        System.out.println(p.toSvg());

        Point p2 = p.translated(4.0, 3.0);
        System.out.println(p);
        System.out.println(p2);

        Point p3 = new Point();
        p3.setX(6.0);
        p3.setY(4.0);

        Segment s = new Segment(p, p2);
        System.out.println(s.length());

        Segment s2 = new Segment(p2, p3);

        Segment s3 = new Segment(p, p3);

        Segment[] segments = {s, s2, s3};
        Segment longest_segment = Segment.longest_segment(segments);
        System.out.println("s1 points:\n\t" + s.getP1().toString() + "\n\t" + s.getP2().toString() + "\ns1 length: " + s.length() +
                "\ns2 points:\n\t" + s2.getP1().toString() + "\n\t" + s2.getP2().toString() + "\ns2 length: " + s2.length() +
                "\ns3 points:\n\t" + s3.getP1().toString() + "\n\t" + s3.getP2().toString() + "\ns3 length: " + s3.length());
        System.out.println("The longest segment is " + longest_segment.toString() + "\n\n");


        Segment s4 = new Segment(new Point(3.5, 5.3), new Point(4.2, 2.4));
        System.out.println(s4);
    }

    public static void polygons() {
        Point[] points = {
                new Point(10.0, 50.0),
                new Point(50.0, 100.0),
                new Point(100.0, 150.0)
        };

        Polygon polygon = new Polygon(points);
        System.out.println(polygon);
        System.out.println(polygon.toSvg());
    }

    public static void scene() {
        Polygon p1 = new Polygon(new Point[]{
                new Point(2.0, 6.5),
                new Point(2.0, 6.5),
                new Point(2.0, 6.5)
        });
        Polygon p2 = new Polygon(new Point[]{
                new Point(3.0, 5.5),
                new Point(2.0, 6.5),
                new Point(2.0, 6.5)
        });
        Polygon p3 = new Polygon(new Point[]{
                new Point(4.0, 8.5),
                new Point(10.0, 20.0),
                new Point(25.0, 45.0)
        });

        SvgScene scene = new SvgScene();
        scene.addPolygon(p1);
        scene.addPolygon(p2);
        scene.addPolygon(p3);
        System.out.println(scene);
        System.out.println(scene.toSvg());
//        Polygon p4 = new Polygon(new Point[]{new Point(2.0, 10.5)});
//        scene.addPolygon(p4);
//        System.out.println(scene);
    }
}
