package ch_34_03.book.lst_12;

import ch_34_02.book.lst_09_10.StillClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockAnimation extends JFrame {
    private StillClock clock = new StillClock();

    public ClockAnimation() throws HeadlessException {
        add(clock);

        Timer timer = new Timer(1000, new TimerListener());
        timer.start();
    }

    class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clock.setCurrentTime();
            clock.repaint();
        }
    }

    public static void main(String[] args) {
         JFrame frame = new ClockAnimation();
         frame.setTitle("ClockAnimation");
         frame.setSize(200, 200);
         frame.setLocationRelativeTo(null); // Center the frame
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);

    }
}
