package ch_34_03.home.lst_27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EyeHandPanel extends JPanel {

    private long timeStart;
    private Circle circle;
    private int countCircles = 0;

    private boolean drawString = false;

    public EyeHandPanel() {
        this.timeStart = System.currentTimeMillis();

        int x = (int) (20 + Math.random() * 400 - 20);
        int y = (int) (20 + Math.random() * 300 - 20);

        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        circle = new Circle(x, y, new Color(r, g, b));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (circle.contains(e.getX(), e.getY())) {

                    int x = (int) (20 + Math.random() * 400 - 20);
                    int y = (int) (20 + Math.random() * 300 - 20);

                    int r = (int) (Math.random() * 256);
                    int g = (int) (Math.random() * 256);
                    int b = (int) (Math.random() * 256);

                    circle = new Circle(x, y, new Color(r, g, b));
                    countCircles++;

                    repaint();
                }

                if (countCircles == 12)
                    drawString = true;

            }
        });

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!drawString) {
            g.setColor(circle.getColor());
            g.fillOval(circle.getxStartDraw(), circle.getyStartDraw(), 20, 20);
        }
        else {
            g.drawString("Time spent: " + (System.currentTimeMillis() - timeStart) + " miliseconds", 40, 40);
        }
    }
}
