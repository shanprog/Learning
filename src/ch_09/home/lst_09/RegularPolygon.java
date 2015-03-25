package ch_09.home.lst_09;

public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;


    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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

    public double getPerimeter() {
        return this.side * this.n;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }


    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Perimetr of polygon1: " + polygon1.getPerimeter() + ", area: " + polygon1.getArea());
        System.out.println("Perimetr of polygon2: " + polygon2.getPerimeter() + ", area: " + polygon2.getArea());
        System.out.println("Perimetr of polygon3: " + polygon3.getPerimeter() + ", area: " + polygon3.getArea());
    }
}
