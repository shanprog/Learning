package ch_34_01.home.lst_11;

import javax.swing.*;
import java.awt.*;

public class DisplayFourCards extends JFrame {
    public DisplayFourCards() throws HeadlessException {

        setLayout(new FlowLayout());

        for (int i = 0; i < 4; i++) {
            JButton button = new JButton(new ImageIcon("image/card/backCard.png"));
            ImageIcon card = new ImageIcon("image/card/" + ((int) (1 + Math.random() * 54)) + ".png");
            button.setPressedIcon(card);
            add(button);
        }

    }

    public static void main(String[] args) {
        DisplayFourCards displayFourCards = new DisplayFourCards();

        displayFourCards.setTitle("DisplayFourCards");
        displayFourCards.pack();
        displayFourCards.setLocationRelativeTo(null);
        displayFourCards.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        displayFourCards.setVisible(true);
    }
}
