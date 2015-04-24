package ch_34_04.home.lst_03;

import javax.swing.*;
import java.awt.*;

public class TrafficLights extends JFrame {

    public TrafficLights() throws HeadlessException {

        TrafficLightPanel panel = new TrafficLightPanel();

        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        JRadioButton jrbGreen = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();

        group.add(jrbRed);
        group.add(jrbYellow);
        group.add(jrbGreen);

        jrbRed.addActionListener(new TrafficLightAction(panel));
        jrbYellow.addActionListener(new TrafficLightAction(panel));
        jrbGreen.addActionListener(new TrafficLightAction(panel));

        JPanel switchPanel = new JPanel();
        switchPanel.add(jrbRed);
        switchPanel.add(jrbYellow);
        switchPanel.add(jrbGreen);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(switchPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TrafficLights frame = new TrafficLights();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Traffic Lights");
        frame.pack();
        frame.setVisible(true);
    }
}
