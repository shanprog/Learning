package ch_34_01.home.lst_06;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DisplayIcons extends JFrame {

    public DisplayIcons() throws HeadlessException {

        setLayout(new GridLayout(2, 2));

        ImageIcon ukIcon = new ImageIcon("image/uk.gif");
        ImageIcon caIcon = new ImageIcon("image/ca.gif");
        ImageIcon usIcon = new ImageIcon("image/us.gif");
        ImageIcon deIcon = new ImageIcon("image/denmark.gif");

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel label1 = new JLabel(ukIcon);
        JLabel label2 = new JLabel(caIcon);
        JLabel label3 = new JLabel(usIcon);
        JLabel label4 = new JLabel(deIcon);

        label1.setBorder(border);
        label2.setBorder(border);
        label3.setBorder(border);
        label4.setBorder(border);

        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }

    public static void main(String[] args) {
        DisplayIcons displayIcons = new DisplayIcons();

        displayIcons.setTitle("Display Labels");
        displayIcons.pack();
        displayIcons.setLocationRelativeTo(null);
        displayIcons.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        displayIcons.setVisible(true);
    }
}
