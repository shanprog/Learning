package ch_34_03.book.lst_02_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCircle extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle() throws HeadlessException {
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        jbtEnlarge.addActionListener(new EnlargeListener());
        jbtShrink.addActionListener(new ShrinkListener());
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircle();
        frame.setTitle("ControlCircle");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }


    private class EnlargeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.enlarge();
        }
    }

    private class ShrinkListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.shrink();
        }
    }

    class CirclePanel extends JPanel {

        private int radius = 5;

        public void enlarge() {
            radius++;
            repaint();
        }

        public void shrink() {
            if (radius > 0)
                radius--;

            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
        }
    }
}
