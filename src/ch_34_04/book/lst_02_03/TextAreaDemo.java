package ch_34_04.book.lst_02_03;

import javax.swing.*;
import java.awt.*;

public class TextAreaDemo extends JFrame {
    private DescriptionPanel descriptionPanel = new DescriptionPanel();

    public TextAreaDemo() throws HeadlessException {
        descriptionPanel.setTitle("Canada");
        String description = "The Canadian national flag...";
        descriptionPanel.setImageIcon(new ImageIcon("image/ca.gif"));
        descriptionPanel.setDescription(description);

        // Add the description panel to the frame
        setLayout(new BorderLayout());
        add(descriptionPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TextAreaDemo");
        frame.setVisible(true);
    }
}
