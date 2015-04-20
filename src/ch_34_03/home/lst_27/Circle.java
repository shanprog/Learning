package ch_34_03.home.lst_27;

import java.awt.*;

public class Circle {

    private int xCenter;
    private int yCenter;
    private final int radius = 10;

    private Color color;

    public Circle(int xCenter, int yCenter, Color color) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.color = color;
    }

    public int getxStartDraw() {
        return xCenter - radius;
    }

    public int getyStartDraw() {
        return yCenter - radius;
    }

    public boolean contains(int x, int y) {
        return Math.sqrt(Math.pow(x - xCenter, 2) + Math.pow(y - yCenter, 2)) < radius;
    }

    public Color getColor() {
        return color;
    }
}
