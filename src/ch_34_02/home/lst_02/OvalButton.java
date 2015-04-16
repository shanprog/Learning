package ch_34_02.home.lst_02;

import javax.swing.*;
import java.awt.*;

public class OvalButton extends JButton {

    public OvalButton(String text) {
        super(text);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(4, 4, getWidth() - 8, getHeight() - 8);
    }
}
