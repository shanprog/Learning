package ch_34_04.home.lst_15;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class UseJScroolBar extends JFrame {

    private JPanel panelText;

    public UseJScroolBar() throws HeadlessException {

        setLayout(new GridLayout(2, 1));

        JScrollBar redBar = new JScrollBar(JScrollBar.HORIZONTAL);
        JScrollBar greenBar = new JScrollBar(JScrollBar.HORIZONTAL);
        JScrollBar blueBar = new JScrollBar(JScrollBar.HORIZONTAL);

        redBar.setMinimum(0);
        greenBar.setMinimum(0);
        blueBar.setMinimum(0);

        redBar.setMaximum(255);
        greenBar.setMaximum(255);
        blueBar.setMaximum(255);


        redBar.addAdjustmentListener(e -> {

            Color fColor = panelText.getForeground();
            int red = e.getValue();
            int green = fColor.getGreen();
            int blue = fColor.getBlue();

            panelText.setForeground(new Color(red, green, blue));
        });

        greenBar.addAdjustmentListener(e -> {

            Color fColor = panelText.getForeground();
            int red = fColor.getRed();
            int green = e.getValue();
            int blue = fColor.getBlue();

            panelText.setForeground(new Color(red, green, blue));
        });

        blueBar.addAdjustmentListener(e -> {

            Color fColor = panelText.getForeground();
            int red = fColor.getRed();
            int green = fColor.getGreen();
            int blue = e.getValue();

            panelText.setForeground(new Color(red, green, blue));
        });

        panelText = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawString("Show Color", 20, 20);
            }
        };

        JPanel labelPanel = new JPanel(new GridLayout(3, 1));
        labelPanel.add(new JLabel("Red"));
        labelPanel.add(new JLabel("Green"));
        labelPanel.add(new JLabel("Blue"));

        JPanel scrollsPanel = new JPanel(new GridLayout(3, 1));
        scrollsPanel.add(redBar);
        scrollsPanel.add(greenBar);
        scrollsPanel.add(blueBar);

        JPanel choosePanel = new JPanel(new BorderLayout());
        choosePanel.setBorder(new TitledBorder("Choose colors"));
        choosePanel.add(labelPanel, BorderLayout.WEST);
        choosePanel.add(scrollsPanel, BorderLayout.CENTER);

        add(panelText);
        add(choosePanel);
    }

    public static void main(String[] args) {
        UseJScroolBar frame = new UseJScroolBar();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Use JScroolBar");
        frame.pack();
        frame.setVisible(true);
    }
}
