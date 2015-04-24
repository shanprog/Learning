package ch_34_04.home.lst_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TextViwer extends JFrame {

    private JTextArea textArea;
    private JTextField path;
    private JButton button;

    public TextViwer() throws HeadlessException {
        textArea = new JTextArea();
        path = new JTextField(20);
        button = new JButton("View");

        button.addActionListener(e -> {
            if (!path.getText().equals("")) {

                textArea.setText("");

                try {
                    Scanner input = new Scanner(new File(path.getText()));

                    while (input.hasNext()) {
                        textArea.append(input.nextLine() + "\n");
                    }
                } catch (IOException ioe) {
                }


            }
        });

        textArea.setEditable(false);


        JPanel pathPanel = new JPanel();
        pathPanel.add(path);
        pathPanel.add(button);


        setLayout(new BorderLayout(2, 1));
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(pathPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TextViwer frame = new TextViwer();

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Text Viwer");
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
