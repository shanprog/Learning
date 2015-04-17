package ch_34_03.book.lst_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlCircleWithMouseAndKey extends JFrame {
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircleWithMouseAndKey() throws HeadlessException {
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        this.add(canvas, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);

        jbtEnlarge.addActionListener(e -> {
            canvas.enlarge();
            canvas.requestFocusInWindow();
        });

        jbtShrink.addActionListener(e -> {
            canvas.shrink();
            canvas.requestFocusInWindow();
        });

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1)
                    canvas.enlarge();
                else if (e.getButton() == MouseEvent.BUTTON3)
                    canvas.shrink();
            }
        });

        canvas.setFocusable(true);
        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP)
                    canvas.enlarge();
                else if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    canvas.shrink();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircleWithMouseAndKey();
        frame.setTitle("ControlCircle");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    class CirclePanel extends JPanel {
        private int radius = 5;

        public void enlarge() {
            radius++;
            repaint();
        }

        public void shrink() {
            if (radius >= 1) radius--;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
        }
    }
}
