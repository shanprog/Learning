package ch_34_01.home.lst_03;

import javax.swing.*;
import java.awt.*;

public class UseGridLayout extends JFrame {

    public UseGridLayout() throws HeadlessException {
        setLayout(new GridLayout(2, 3, 2, 2));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
    }

    public static void main(String[] args) {
        UseGridLayout useGridLayout = new UseGridLayout();

        useGridLayout.setTitle("UseFlowLayout");
        useGridLayout.pack();
        useGridLayout.setLocationRelativeTo(null);
        useGridLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        useGridLayout.setVisible(true);
    }
}
