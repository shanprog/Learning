package ch_34_03.book.lst_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandleEvent extends JFrame {

    public HandleEvent() throws HeadlessException {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        add(panel);

        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();

        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);
    }

    public static void main(String[] args) {
        JFrame frame = new HandleEvent();

        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class OKListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked");
    }
}

class CancelListenerClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel buttin clicked");
    }
}