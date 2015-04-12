package ch_34_01.home.lst_01;

import javax.swing.*;
import java.awt.*;

public class UseFlowLayout extends JFrame {

    public UseFlowLayout() throws HeadlessException {

        setLayout(new FlowLayout());

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

        add(panel1);
        add(panel2);
    }

    public static void main(String[] args) {
        UseFlowLayout useFlowLayout = new UseFlowLayout();

        useFlowLayout.setTitle("UseFlowLayout");
        useFlowLayout.pack();
        useFlowLayout.setLocationRelativeTo(null);
        useFlowLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        useFlowLayout.setVisible(true);
    }
}
