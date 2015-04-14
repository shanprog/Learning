package ch_34_02.book.lst_02_03;

import javax.swing.*;
import java.awt.*;

public class TestFigurePanel extends JFrame {

    public TestFigurePanel() throws HeadlessException {
        setLayout(new GridLayout(2, 3, 5, 5));
        add(new FigurePanel(FigurePanel.LINE));
        add(new FigurePanel(FigurePanel.RECTANGLE));
        add(new FigurePanel(FigurePanel.ROUND_RECTANGLE));
        add(new FigurePanel(FigurePanel.OVAL));
        add(new FigurePanel(FigurePanel.RECTANGLE, true));
        add(new FigurePanel(FigurePanel.ROUND_RECTANGLE, true));

    }

    public static void main(String[] args) {
        TestFigurePanel frame = new TestFigurePanel();
        frame.setSize(400, 200);
        frame.setTitle("TestFigurePanel");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
