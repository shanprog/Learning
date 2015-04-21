package ch_34_03.home.lst_22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerAction implements ActionListener {

    private int leftOrRight = 2;
    private Bean bean;
    private BeanMachinePanel panel;
    private BeanMachineAnimation machine;

    public TimerAction(BeanMachinePanel panel, BeanMachineAnimation machine) {
        this.panel = panel;
        this.machine = machine;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        bean.setyCenter(bean.getyCenter() + 2);

        switch (bean.getyCenter()) {
            case 50:
            case 70:
            case 90:
            case 110:
            case 130:
            case 150:
            case 170:
                leftOrRight = (int) (Math.random() * 2);
                if (leftOrRight == 1)
                    bean.addPosition();
                break;
            case 60:
            case 80:
            case 100:
            case 120:
            case 140:
            case 160:
            case 180:
                leftOrRight = 2;
                break;
        }

        if (leftOrRight == 0)
            bean.setxCenter(bean.getxCenter() - 2);
        else if (leftOrRight == 1) {
            bean.setxCenter(bean.getxCenter() + 2);
        }

        panel.repaint();

        if (bean.getyCenter() > 180) {
            machine.stopAnimation();
        }

    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }
}
