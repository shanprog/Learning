package ch_34_02.home.lst_05;

import javax.swing.*;
import java.awt.*;

public class TrianglePatternPanel extends JPanel {

    private Font font;
    private FontMetrics fm;

    public TrianglePatternPanel() {

        font = new Font("Times New Roman", 0, 20);
        fm = getFontMetrics(font);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int height = 0;
        int count = getHeight() / fm.getHeight();
        setFont(font);

        String str = "";
        for (int i = 1; i <= count; i++) {

            str += (i + " ");

            g.drawString(str, 10, height += fm.getHeight());
        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new TrianglePatternPanel());


        frame.setTitle("Excersise 5");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

