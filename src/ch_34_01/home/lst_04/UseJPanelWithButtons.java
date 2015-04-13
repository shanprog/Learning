package ch_34_01.home.lst_04;

import javax.swing.*;
import java.awt.*;

public class UseJPanelWithButtons extends JPanel {

    public UseJPanelWithButtons() {
        setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        add(button1);
        add(button2);
        add(button3);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("UseJPanel");

        frame.setLayout(new FlowLayout());

        frame.add(new UseJPanelWithButtons());
        frame.add(new UseJPanelWithButtons());


        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
