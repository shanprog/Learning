package ch_34_04.book.lst_07;

import ch_34_02.book.lst_07_08.MessagePanel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo extends JFrame {
    private JSlider jsldHort = new JSlider(JSlider.HORIZONTAL);
    private JSlider jsldVert = new JSlider(JSlider.VERTICAL);

    private MessagePanel messagePanel = new MessagePanel("Welcome to Java");


    public SliderDemo() throws HeadlessException {
        setLayout(new BorderLayout(5, 5));
        add(messagePanel, BorderLayout.CENTER);
        add(jsldVert, BorderLayout.EAST);
        add(jsldHort, BorderLayout.SOUTH);

        jsldHort.setMaximum(50);
        jsldHort.setPaintLabels(true);
        jsldHort.setPaintTicks(true);
        jsldHort.setMajorTickSpacing(10);
        jsldHort.setMinorTickSpacing(1);
        jsldHort.setPaintTrack(false);
        jsldVert.setInverted(true);
        jsldVert.setMaximum(10);
        jsldVert.setPaintLabels(true);
        jsldVert.setPaintTicks(true);
        jsldVert.setMajorTickSpacing(10);
        jsldVert.setMinorTickSpacing(1);

        jsldHort.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                double value = jsldHort.getValue();
                double maximumValue = jsldHort.getMaximum();
                double newX = (value * messagePanel.getWidth() / maximumValue);
                messagePanel.setxCoordinate((int) newX);
            }
        });

        jsldVert.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                double value = jsldVert.getValue();
                double maximumValue = jsldVert.getMaximum();
                double newY = (value * messagePanel.getHeight() / maximumValue);
                messagePanel.setyCoordinate((int) newY);
            }
        });
    }

    public static void main(String[] args) {
        SliderDemo frame = new SliderDemo();
        frame.setTitle("SliderDemo");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
