package ch_34_01.home.lst_02;

import javax.swing.*;
import java.awt.*;

public class UseBorderLayout extends JFrame {

    public UseBorderLayout() throws HeadlessException {
        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);

        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        UseBorderLayout useBorderLayout = new UseBorderLayout();

        useBorderLayout.setTitle("UseFlowLayout");
        useBorderLayout.pack();
        useBorderLayout.setLocationRelativeTo(null);
        useBorderLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        useBorderLayout.setVisible(true);
    }
}
