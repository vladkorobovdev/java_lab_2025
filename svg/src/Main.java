public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5.0;
        p.y = 7.5;

        System.out.println(p.toSvg());

        Point p2 = p.translated(4.0, 3.0);
        System.out.println(p);
        System.out.println(p2);

        Point p3 = new Point();
        p3.x = 6.0;
        p3.y = 4.0;

        Segment s = new Segment();
        s.p1 = p;
        s.p2 = p2;
        System.out.println(s.length());

        Segment s2 = new Segment();
        s2.p1 = p2;
        s2.p2 = p3;

        Segment s3 = new Segment();
        s3.p1 = p;
        s3.p2 = p3;

        Segment[] segments = {s, s2, s3};
        Segment longest_segment = Segment.longest_segment(segments);
        System.out.println("s1 points:\n\t" + s.p1.toString() + "\n\t" + s.p2.toString() + "\ns1 length: " + s.length() +
                           "\ns2 points:\n\t" + s2.p1.toString() + "\n\t" + s2.p2.toString() + "\ns2 length: " + s2.length() +
                           "\ns3 points:\n\t" + s3.p1.toString() + "\n\t" + s3.p2.toString() + "\ns3 length: " + s3.length());
        System.out.println("The longest segment is " + longest_segment.toString());
    }
}
