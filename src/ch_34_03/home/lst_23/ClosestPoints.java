package ch_34_03.home.lst_23;

import javax.swing.*;
import java.awt.*;

public class ClosestPoints extends JFrame {

    private PointsPanel panel;

    public ClosestPoints() throws HeadlessException {
        panel = new PointsPanel();
        add(panel);
    }

    public static void main(String[] args) {

        JFrame frame = new ClosestPoints();

        frame.setTitle("Closetst Points");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
