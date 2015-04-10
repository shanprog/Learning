package ch_34_01.book.lst_06;

import javax.swing.*;
import java.awt.*;

public class TestPanels extends JFrame {
    public TestPanels() throws HeadlessException {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        for (int i = 1; i <= 9; i++)
            p1.add(new JButton("" + i));

        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2, BorderLayout.EAST);
        add(new JButton("Food to be placed here"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TestPanels frame = new TestPanels();
        frame.setTitle("The Front View of a Microwave Oven");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
