package ch_34_03.home.lst_22;

import javax.swing.*;
import java.awt.*;

public class BeanMachinePanel extends JPanel {

    private int[] beans;
    private Bean bean;
    private boolean hide;

    public BeanMachinePanel() {
        beans = new int[8];
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        paintMachine(g);
        paintBeanInStacks(g);

        if (!hide)
            g.fillOval(bean.getxCenter() - 5, bean.getyCenter() - 5, 10, 10);
    }

    public void addInStacks(int i) {
        beans[i]++;
    }

    public void hideBean() {
        hide = true;
    }

    private void paintMachine(Graphics g) {

        g.drawLine(100, 30, 100, 50);
        g.drawLine(120, 30, 120, 50);
        g.drawLine(100, 50, 30, 184);
        g.drawLine(120, 50, 190, 184);
        g.drawLine(30, 240, 190, 240);

        for (int i = 30; i <= 190; i += 20)
            g.drawLine(i, 184, i, 240);

        int k = 0;

        for (int i = 180; i >= 60; i -= 20) {
            for (int j = 50 + k; j <= 170 - k; j += 20)
                g.drawOval(j - 4, i - 4, 8, 8);

            k += 10;
        }
    }

    private void paintBeanInStacks(Graphics g) {

        int k = 35;

        for (int bean : beans) {
            for (int j = 240; j > 240 - bean * 10; j -= 10)
                g.fillOval(k, j - 10, 10, 10);

            k += 20;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(220, 270);
    }
}
