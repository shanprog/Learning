package ch_34_01.home.lst_07;

import javax.swing.*;
import java.awt.*;

public class TicTacToeBoard extends JFrame {

    public TicTacToeBoard() throws HeadlessException {

        ImageIcon oIcon = new ImageIcon("image/o.gif");
        ImageIcon xIcon = new ImageIcon("image/x.gif");

        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            int r = (int) (Math.random() * 3);

            if (r == 0)
                add(new JLabel(oIcon));
            else if (r == 1)
                add(new JLabel(xIcon));
            else {
                JLabel label = new JLabel();
                label.setSize(40, 40);
                add(label);

            }
        }

    }

    public static void main(String[] args) {
        TicTacToeBoard board = new TicTacToeBoard();

        board.setTitle("TicTacToe");
        board.pack();
        board.setLocationRelativeTo(null);
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setVisible(true);
    }
}
