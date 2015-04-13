package ch_34_01.home.lst_09;

import javax.swing.*;
import java.awt.*;

public class DisplayThreeCards extends JFrame {

    public DisplayThreeCards() throws HeadlessException {

        setLayout(new FlowLayout());

        for (int i = 0; i < 3; i++)
            add(new JLabel(new ImageIcon("image/card/" + ((int) (1 + Math.random() * 54)) + ".png")));
    }

    public static void main(String[] args) {
        DisplayThreeCards threeCards = new DisplayThreeCards();

        threeCards.setTitle("Display Labels");
        threeCards.pack();
        threeCards.setLocationRelativeTo(null);
        threeCards.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        threeCards.setVisible(true);
    }
}
