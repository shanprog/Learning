package ch_34_03.home.lst_27;

import javax.swing.*;
import java.awt.*;

public class EyeHandCoordination extends JFrame {

    public EyeHandCoordination() throws HeadlessException {
        EyeHandPanel panel = new EyeHandPanel();
        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new EyeHandCoordination();

        frame.setTitle("Eye-Hand Coordination");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
