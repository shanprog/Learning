package ch_34_03.home.lst_23;

public class MyPoint {

    private int xCenter, yCenter;
    private int radius = 2;
    private boolean fill = false;

    public MyPoint(int xCenter, int yCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public int getxCenter() {
        return xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isFill() {
        return fill;
    }

    public int getxCoord() {
        return xCenter - radius;
    }

    public int getyCoord() {
        return yCenter - radius;
    }

    public int getDiametr() {
        return 2 * radius;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public double getDistance(MyPoint p) {
        return Math.sqrt(Math.pow(p.getxCenter() - xCenter, 2) + Math.pow(p.getyCenter() - yCenter, 2));
    }
}
