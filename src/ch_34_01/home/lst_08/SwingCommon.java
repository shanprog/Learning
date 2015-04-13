package ch_34_01.home.lst_08;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingCommon extends JFrame {

    public SwingCommon() throws HeadlessException {
        JLabel label1 = new JLabel("black");
        JLabel label2 = new JLabel("blue");
        JLabel label3 = new JLabel("cyan");
        JLabel label4 = new JLabel("green");
        JLabel label5 = new JLabel("magenta");
        JLabel label6 = new JLabel("orange");

        label1.setBackground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        label3.setBackground(Color.WHITE);
        label4.setBackground(Color.WHITE);
        label5.setBackground(Color.WHITE);
        label6.setBackground(Color.WHITE);


        label1.setForeground(Color.BLACK);
        label2.setForeground(Color.BLUE);
        label3.setForeground(Color.CYAN);
        label4.setForeground(Color.GREEN);
        label5.setForeground(Color.MAGENTA);
        label6.setForeground(Color.ORANGE);

        Border border = BorderFactory.createLineBorder(Color.YELLOW);

        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        label4.setBorder(border);
        label5.setBorder(border);
        label6.setBorder(border);


        Font font = new Font("Times New Roman", Font.BOLD, 20);

        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        label5.setFont(font);
        label6.setFont(font);

        label1.setToolTipText("black");
        label2.setToolTipText("blue");
        label3.setToolTipText("cyan");
        label4.setToolTipText("green");
        label5.setToolTipText("magenta");
        label6.setToolTipText("orange");


        setLayout(new GridLayout(2, 3));

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
    }

    public static void main(String[] args) {
        SwingCommon common = new SwingCommon();

        common.setTitle("Common Swing");
        common.pack();
        common.setLocationRelativeTo(null);
        common.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        common.setVisible(true);
    }
}
