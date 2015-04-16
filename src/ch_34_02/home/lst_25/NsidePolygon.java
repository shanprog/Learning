package ch_34_02.home.lst_25;

import javax.swing.*;
import java.awt.*;

public class NsidePolygon extends JPanel {

    private int numberOfSides;

    public NsidePolygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int radius = (int) (Math.min(xCenter, yCenter) * 0.4);

        Polygon polygon = new Polygon();

        for (int i = 0; i < numberOfSides; i++) {

            double angle = i * 2 * Math.PI / numberOfSides;

            int x = xCenter + (int) (radius * Math.cos(angle));
            int y = yCenter - (int) (radius * Math.sin(angle));

            polygon.addPoint(x, y);
        }

        g.drawPolygon(polygon);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new GridLayout(1, 6));
        for (int i = 5; i < 11; i++) {
            frame.add(new NsidePolygon(i));
        }

        frame.setTitle("Excersise 25");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
