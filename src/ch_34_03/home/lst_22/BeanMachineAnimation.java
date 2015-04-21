package ch_34_03.home.lst_22;

import javax.swing.*;
import java.awt.*;

public class BeanMachineAnimation extends JFrame {

    private Timer timer;
    private boolean endAnimation;
    private BeanMachinePanel panel;
    private int count = 0;
    private TimerAction timerAction;
    private Bean bean;

    public BeanMachineAnimation() throws HeadlessException {
        panel = new BeanMachinePanel();
        timerAction = new TimerAction(panel, this);
        timer = new Timer(50, timerAction);
        setBean();

        add(panel);
    }

    public void setBean() {
        bean = new Bean();
        timerAction.setBean(bean);
        endAnimation = false;
        panel.setBean(bean);

        timer.start();
    }

    public void stopAnimation() {
        panel.addInStacks(bean.getPosition());
        timer.stop();
        count++;

        if (count < 10)
            setBean();
        else
            panel.hideBean();
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
