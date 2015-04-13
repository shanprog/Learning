package ch_34_01.home.lst_05;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DisplayLabels extends JFrame {

    public DisplayLabels() throws HeadlessException {

        JLabel label1 = new JLabel("Department of Computer Scince");
        JLabel label2 = new JLabel("School of Computing");
        JLabel label3 = new JLabel("Armstrong Atlantic State Univesity");
        JLabel label4 = new JLabel("Tel: (912)921-6440");

        setLayout(new GridLayout(4, 1));

        Border border = BorderFactory.createLineBorder(Color.BLACK);

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
        DisplayLabels displayLabels = new DisplayLabels();

        displayLabels.setTitle("Display Labels");
        displayLabels.pack();
        displayLabels.setLocationRelativeTo(null);
        displayLabels.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        displayLabels.setVisible(true);
    }
}
