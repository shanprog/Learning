package ch_34_04.home.lst_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightAction implements ActionListener {

    private TrafficLightPanel panel;

    public TrafficLightAction(TrafficLightPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Red")) {
            panel.caseRed();
        }
        if (e.getActionCommand().equals("Yellow")) {
            panel.caseYellow();
        }
        if (e.getActionCommand().equals("Green")) {
            panel.caseGreen();
        }

        panel.repaint();
    }
}
