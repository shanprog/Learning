package ch_34_01.book.lst_09;

import javax.swing.*;
import java.awt.*;

public class TestButtonIcons extends JFrame {

    public TestButtonIcons() throws HeadlessException {
        ImageIcon usIcon = new ImageIcon("image/usIcon.gif");
        ImageIcon caIcon = new ImageIcon("image/caIcon.gif");
        ImageIcon ukIcon = new ImageIcon("image/ukIcon.gif");


        JButton jbt = new JButton("Click it", usIcon);
        jbt.setPressedIcon(caIcon);
        jbt.setRolloverIcon(ukIcon);

        add(jbt);
    }

    public static void main(String[] args) {
        JFrame frame = new TestButtonIcons();
        frame.setTitle("ButtonIcons");
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
