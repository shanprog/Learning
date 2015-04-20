package ch_34_03.home.lst_22;

public class Bean {

    private int xCenter = 110;
    private int yCenter = 40;
    private final int radius = 10;

    private int position = 0;

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public int getxCenter() {
        return xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void addPosition() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
