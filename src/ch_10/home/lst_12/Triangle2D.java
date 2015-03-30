package ch_10.home.lst_12;

import ch_10.home.lst_04.MyPoint;

import java.awt.geom.Line2D;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public double getArea() {

        double p = getPerimeter() / 2;
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean contains(MyPoint point) {

        Triangle2D t1 = new Triangle2D(getP1(), getP1(), point);
        Triangle2D t2 = new Triangle2D(getP2(), getP3(), point);
        Triangle2D t3 = new Triangle2D(getP1(), getP3(), point);

        double area = t1.getArea() + t2.getArea() + t3.getArea();

        return area <= getArea();
    }

    public boolean contains(Triangle2D t) {
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    public boolean overlaps(Triangle2D t) {

        Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
        Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
        Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());

        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

        return contains(t) || t.contains(this) ||
                line1.intersectsLine(side1) ||
                line1.intersectsLine(side2) ||
                line1.intersectsLine(side3) ||
                line2.intersectsLine(side1) ||
                line2.intersectsLine(side2) ||
                line2.intersectsLine(side3) ||
                line3.intersectsLine(side1) ||
                line3.intersectsLine(side2) ||
                line3.intersectsLine(side3);
    }


    public static void main(String[] args) {
        Triangle2D r1 = new Triangle2D(new MyPoint(2, 2), new MyPoint(5.5, 4.9), new MyPoint(9.0, 10.3));
        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println(r1.contains(new MyPoint(3, 3)));
        System.out.println(r1.contains(new Triangle2D(new MyPoint(4, 5), new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))));
        System.out.println(r1.overlaps(new Triangle2D(new MyPoint(3, 5), new MyPoint(2.3, 6.7), new MyPoint(5.5, 8.8))));
    }

}
