package ch_34_02.book.lst_09_10;

import ch_34_02.book.lst_07_08.MessagePanel;

import javax.swing.*;
import java.awt.*;

public class DisplayClock extends JFrame {
    public DisplayClock() throws HeadlessException {
        StillClock clock = new StillClock();

        MessagePanel messagePanel = new MessagePanel(clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());

        messagePanel.setCentered(true);
        messagePanel.setForeground(Color.blue);
        messagePanel.setFont(new Font("Courier", Font.BOLD, 16));

        // Add the clock and message panel to the frame
        add(clock);
        add(messagePanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        DisplayClock frame = new DisplayClock();
        frame.setTitle("DisplayClock");
        frame.setSize(300, 350);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
