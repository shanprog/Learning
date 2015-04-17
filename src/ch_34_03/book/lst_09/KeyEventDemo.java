package ch_34_03.book.lst_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventDemo extends JFrame {
    private KeyboardPanel keyboardPanel = new KeyboardPanel();

    public KeyEventDemo() throws HeadlessException {

        add(keyboardPanel);
        keyboardPanel.setFocusable(true);
    }

    public static void main(String[] args) {
        KeyEventDemo frame = new KeyEventDemo();
        frame.setTitle("KeyEventDemo");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class KeyboardPanel extends JPanel {
        private int x = 100;
        private int y = 100;
        private char keyChar = 'A';

        public KeyboardPanel() {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_DOWN:
                            y += 10;
                            break;
                        case KeyEvent.VK_UP:
                            y -= 10;
                            break;
                        case KeyEvent.VK_LEFT:
                            x -= 10;
                            break;
                        case KeyEvent.VK_RIGHT:
                            x += 10;
                            break;
                        default:
                            keyChar = e.getKeyChar();
                    }

                    repaint();

                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
            g.drawString(String.valueOf(keyChar), x, y);
        }
    }
}
