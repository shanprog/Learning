package ch_30.book.lst_02;

import javax.swing.*;
import java.awt.*;

public class SwingFlashText extends JFrame {

    private String text = "";

    public SwingFlashText() throws HeadlessException {
        setLayout(new FlowLayout());
        JLabel jlblText = new JLabel("Welcome");

        new Thread(() -> {
            try {
                while (true) {
                    if (jlblText.getText().trim().length() == 0)
                        text = "Welcome";
                    else
                        text = "";

                    jlblText.setText(text);

                    Thread.sleep(200);
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }).start();

        add(jlblText);

    }

    public static void main(String[] args) {

        SwingFlashText frame = new SwingFlashText();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Flash text");
        frame.pack();
        frame.setVisible(true);
    }
}
