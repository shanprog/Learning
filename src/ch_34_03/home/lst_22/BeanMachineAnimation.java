package ch_34_03.home.lst_22;

import javax.swing.*;
import java.awt.*;

public class BeanMachineAnimation extends JFrame {

    private Timer timer;

    public BeanMachineAnimation() throws HeadlessException {
        BeanMachinePanel panel = new BeanMachinePanel();

        for (int i = 0; i < 10; i++) {
            Bean bean = new Bean();

            TimerAction timerAction = new TimerAction(bean, panel, this);
            timer = new Timer(100, timerAction);
            timer.start();

            if (bean.getyCenter() > 180) {
                timer.stop();
                continue;
            }
        }

        add(panel);
    }

    public static void main(String[] args) {
        JFrame frame = new BeanMachineAnimation();

        frame.setTitle("Bean-Machine Animation");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
