package ch_34_02.book.lst_07_08;

import javax.swing.*;
import java.awt.*;

public class MessagePanel extends JPanel {

    private String message = "Welcome to Java";
    private int xCoordinate = 20;
    private int yCoordinate = 20;

    private boolean centered;

    private int interval = 10;

    public MessagePanel() {
    }

    public MessagePanel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        repaint();
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
        repaint();
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
        repaint();
    }

    public boolean isCentered() {
        return centered;
    }

    public void setCentered(boolean centered) {
        this.centered = centered;
        repaint();
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (centered) {
            FontMetrics fm = g.getFontMetrics();
            int stringWidth = fm.stringWidth(message);
            int stringAscent = fm.getAscent();

            xCoordinate = getWidth() / 2 - stringWidth / 2;
            yCoordinate = getHeight() / 2 + stringAscent / 2;
        }

        g.drawString(message, xCoordinate, yCoordinate);
    }

    public void moveLeft() {
        xCoordinate -= interval;
    }

    public void moveRight() {

        xCoordinate -= interval;
        repaint();
    }

    public void moveUp() {
        yCoordinate -= interval;
        repaint();
    }

    public void moveDown() {
        yCoordinate += interval;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 30);
    }
}
