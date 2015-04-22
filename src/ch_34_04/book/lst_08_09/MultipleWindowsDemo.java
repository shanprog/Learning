package ch_34_04.book.lst_08_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleWindowsDemo extends JFrame {
    private JTextArea jta;
    private JButton jbtShowHistogram = new JButton("Show Histogram");
    private Histogram histogram = new Histogram();

    private JFrame histogramFrame = new JFrame();

    public MultipleWindowsDemo() throws HeadlessException {

        JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
        scrollPane.setPreferredSize(new Dimension(300, 200));
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);

        // Place scroll pane and button in the frame
        add(scrollPane, BorderLayout.CENTER);
        add(jbtShowHistogram, BorderLayout.SOUTH);

        jbtShowHistogram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] count = countLetters();

                // Set the letter count to histogram for display
                histogram.showHistogram(count);

                // Show the frame
                histogramFrame.setVisible(true);
            }
        });

        histogramFrame.add(histogram);
        histogramFrame.pack();
        histogramFrame.setTitle("Histogram");
    }

    private int[] countLetters() {
        int[] count = new int[26];
        String text = jta.getText();

        // Count occurrences of each letter (case insensitive)
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                count[character - 'A']++;
            } else if (character >= 'a' && character <= 'z') {
                count[character - 'a']++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MultipleWindowsDemo frame = new MultipleWindowsDemo();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MultipleWindowsDemo");
        frame.pack();
        frame.setVisible(true);
    }
}
