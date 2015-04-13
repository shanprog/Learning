package ch_34_01.home.lst_10;

import javax.swing.*;
import java.awt.*;

public class CheckerboardJButton extends JFrame {

    public CheckerboardJButton() throws HeadlessException {

        setLayout(new GridLayout(8, 8));

        boolean whiteOrBlack = true;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Color color = whiteOrBlack ? Color.WHITE : Color.BLACK;
                JButton button = new JButton("");
                button.setBackground(color);
                add(button);
                whiteOrBlack = !whiteOrBlack;
            }

            whiteOrBlack = !whiteOrBlack;
        }

    }

    public static void main(String[] args) {
        CheckerboardJButton checkerboardJButton = new CheckerboardJButton();

        checkerboardJButton.setTitle("Checkerboard");
        checkerboardJButton.setSize(320, 340);
        checkerboardJButton.setLocationRelativeTo(null);
        checkerboardJButton.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checkerboardJButton.setVisible(true);
    }
}
