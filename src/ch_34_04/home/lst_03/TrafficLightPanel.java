package ch_34_04.home.lst_03;

import javax.swing.*;
import java.awt.*;

public class TrafficLightPanel extends JPanel {

    private boolean red;
    private boolean yellow;
    private boolean green;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(getWidth() / 2 - 40, 20, getWidth() / 2 + 40, 20);
        g.drawLine(getWidth() / 2 - 40, 240, getWidth() / 2 + 40, 240);
        g.drawLine(getWidth() / 2 - 40, 20, getWidth() / 2 - 40, 240);
        g.drawLine(getWidth() / 2 + 40, 20, getWidth() / 2 + 40, 240);

        if (red) {
            g.setColor(Color.RED);
            g.fillOval(getWidth() / 2 - 30, 30, 60, 60);
            g.setColor(Color.BLACK);
        }
        else
            g.drawOval(getWidth() / 2 - 30, 30, 60, 60);

        if (yellow) {
            g.setColor(Color.YELLOW);
            g.fillOval(getWidth() / 2 - 30, 100, 60, 60);
            g.setColor(Color.BLACK);
        }
        else
            g.drawOval(getWidth() / 2 - 30, 100, 60, 60);


        if (green) {
            g.setColor(Color.GREEN);
            g.fillOval(getWidth() / 2 - 30, 170, 60, 60);
            g.setColor(Color.BLACK);
        }
        else
            g.drawOval(getWidth() / 2 - 30, 170, 60, 60);
    }

    public void caseRed() {
        red = true;
        yellow = false;
        green = false;
    }

    public void caseYellow() {
        red = false;
        yellow = true;
        green = false;
    }

    public void caseGreen() {
        red = false;
        yellow = false;
        green = true;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 300);
    }
}
