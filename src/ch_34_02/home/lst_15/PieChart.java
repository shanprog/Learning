package ch_34_02.home.lst_15;

import javax.swing.*;
import java.awt.*;

public class PieChart extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.3);

        int x = xCenter - radius;
        int y = yCenter - radius;

        g.setColor(Color.RED);
        g.fillArc(x, y, 2 * radius, 2 * radius, 0, (int) ((360 / 100.0) * 20));
        g.setColor(Color.BLUE);
        g.fillArc(x, y, 2 * radius, 2 * radius, (int) ((360 / 100.0) * 20), (int) ((360 / 100.0) * 10));
        g.setColor(Color.GREEN);
        g.fillArc(x, y, 2 * radius, 2 * radius, (int) ((360 / 100.0) * 30), (int) ((360 / 100.0) * 30));
        g.setColor(Color.BLACK);
        g.drawArc(x, y, 2 * radius, 2 * radius, (int) ((360 / 100.0) * 60), (int) ((360 / 100.0) * 40));
        g.drawString("Projects -- 20%", x + (int) (1.8 * radius), y + (int) (0.3 * radius));
        g.drawString("Quizzes -- 10%", x + radius, y - (int) (0.1 * radius));
        g.drawString("Midterms -- 30%", x - (int) (0.2 * radius), y + (int) (0.6 * radius));
        g.drawString("Final -- 40%", x + radius, y + (int) (2.2 * radius));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new PieChart());

        frame.setTitle("Excersise 15");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
