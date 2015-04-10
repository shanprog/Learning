package ch_34_01.book.lst_07;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TestSwingCommonFeatures extends JFrame {

    public TestSwingCommonFeatures() throws HeadlessException {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton jbtLeft = new JButton("Left");
        JButton jbtCenter = new JButton("Center");
        JButton jbtRight = new JButton("Right");

        jbtLeft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("This is the Right button");

        p1.add(jbtLeft);
        p1.add(jbtCenter);
        p1.add(jbtRight);
        p1.setBorder(new TitledBorder("Three Buttons"));
        p1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        Border lineBorder = new LineBorder(Color.BLACK, 2);


        JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
        JLabel jlblRed = new JLabel("Red");
        JLabel jlblOrange = new JLabel("Orange");
        jlblRed.setForeground(Color.RED);

        jlblOrange.setForeground(Color.ORANGE);
        jlblRed.setFont(largeFont);
        jlblOrange.setFont(largeFont);
        jlblRed.setBorder(lineBorder);
        jlblOrange.setBorder(lineBorder);
        p2.add(jlblRed);
        p2.add(jlblOrange);
        p2.setBorder(new TitledBorder("Two Labels"));

//        jbtLeft.setVisible(false);
//        jlblRed.setVisible(false);

        setLayout(new GridLayout(2, 1, 5, 5));
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        JFrame frame = new TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
