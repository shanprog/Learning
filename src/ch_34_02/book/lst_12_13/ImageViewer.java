package ch_34_02.book.lst_12_13;

import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JPanel {

    private java.awt.Image image;
    private boolean stretched = true;
    private int xCoordinate;
    private int yCoordinate;

    public ImageViewer() {
    }

    public ImageViewer(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
        repaint();
    }

    public boolean isStretched() {
        return stretched;
    }

    public void setStretched(boolean stretched) {
        this.stretched = stretched;
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null)
            if (isStretched())
                g.drawImage(image, xCoordinate, yCoordinate, getWidth(), getHeight(), this);
            else
                g.drawImage(image, xCoordinate, yCoordinate, this);
    }
}
