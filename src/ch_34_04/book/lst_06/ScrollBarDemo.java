package ch_34_04.book.lst_06;

import ch_34_02.book.lst_07_08.MessagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarDemo extends JFrame {
    private JScrollBar jscbHort = new JScrollBar(JScrollBar.HORIZONTAL);
    private JScrollBar jscbVert = new JScrollBar(JScrollBar.VERTICAL);

    private MessagePanel messagePanel = new MessagePanel("Welcome to Java");

    public ScrollBarDemo() throws HeadlessException {
        setLayout(new BorderLayout());
        add(messagePanel, BorderLayout.CENTER);
        add(jscbVert, BorderLayout.EAST);
        add(jscbHort, BorderLayout.SOUTH);

        jscbHort.addAdjustmentListener(e -> {
            double value = jscbHort.getValue();
            double maximumValue = jscbHort.getMaximum();
            double newX = (value * messagePanel.getWidth() / maximumValue);
            messagePanel.setxCoordinate((int) newX);
        });

        jscbVert.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                double value = jscbVert.getValue();
                double maximumValue = jscbVert.getMaximum();
                double newY = (value * messagePanel.getHeight() / maximumValue);
                messagePanel.setyCoordinate((int) newY);
            }
        });
    }

    public static void main(String[] args) {
        ScrollBarDemo frame = new ScrollBarDemo();
        frame.setTitle("ScrollBarDemo");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
