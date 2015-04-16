package ch_34_02.home.lst_02;

import javax.swing.*;
import java.awt.*;

public class TestOvalButton extends JFrame {

    public TestOvalButton() throws HeadlessException {
        setLayout(new GridLayout(1, 2));

        add(new OvalButton("OK"));
        add(new OvalButton("Cancel"));
    }

    public static void main(String[] args) {
        TestOvalButton testOvalButton = new TestOvalButton();

        testOvalButton.setTitle("Display Labels");
        testOvalButton.pack();
        testOvalButton.setLocationRelativeTo(null);
        testOvalButton.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        testOvalButton.setVisible(true);
    }
}
