package ch_34_04.home.lst_15;

import javafx.scene.layout.GridPane;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class UseJScroolBar extends JFrame {

    private JScrollBar redBar;
    private JScrollBar greenBar;
    private JScrollBar blueBar;

    private JPanel panelText;

    public UseJScroolBar() throws HeadlessException {

        setLayout(new GridLayout(2, 1));

        redBar = new JScrollBar(JScrollBar.HORIZONTAL);
        greenBar = new JScrollBar(JScrollBar.HORIZONTAL);
        blueBar = new JScrollBar(JScrollBar.HORIZONTAL);

        redBar.setMinimum(0);
        greenBar.setMinimum(0);
        blueBar.setMinimum(0);

        redBar.setMaximum(255);
        greenBar.setMaximum(255);
        blueBar.setMaximum(255);


        redBar.addAdjustmentListener(e -> {

            Color fColor = panelText.getForeground();
            int red = fColor.getRed();
            int green = fColor.getGreen();
            int blue = fColor.getBlue();

            panelText.setForeground(new Color(e.getValue(), green, blue));
        });

        panelText = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawString("Show Color", 20, 20);
            }
        };

        JPanel choosePanel = new JPanel();
        choosePanel.setBorder(new TitledBorder("Choose colors"));

        JPanel labelPanel = new JPanel(new GridLayout(3, 1));
        labelPanel.add(new JLabel("Red"));
        labelPanel.add(new JLabel("Green"));
        labelPanel.add(new JLabel("Blue"));

        JPanel scrollsPanel = new JPanel(new GridLayout(3, 1));
        scrollsPanel.add(redBar);
        scrollsPanel.add(greenBar);
        scrollsPanel.add(blueBar);


        choosePanel.add(labelPanel);
        choosePanel.add(scrollsPanel);

        add(panelText);
        add(choosePanel);
    }

    public static void main(String[] args) {
        UseJScroolBar frame = new UseJScroolBar();

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Use JScroolBar");
        frame.pack();
        frame.setVisible(true);
    }
}
