package ch_34_03.book.lst_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MoveMessageDemo extends JFrame {
    public MoveMessageDemo() throws HeadlessException {
        MovableMessagePanel p = new MovableMessagePanel("Welcome to Java");
        add(p);
    }

    public static void main(String[] args) {
        MoveMessageDemo frame = new MoveMessageDemo();
        frame.setTitle("MoveMessageDemo");
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class MovableMessagePanel extends JPanel {
        private String message = "Welcome to Java";
        private int x = 20;
        private int y = 20;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString(message, x, y);
        }

        public MovableMessagePanel(String s) {
            message = s;

            addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }

                @Override
                public void mouseMoved(MouseEvent e) {
//                    x = e.getX();
//                    y = e.getY();
//                    repaint();
                }
            });


        }
    }
}
