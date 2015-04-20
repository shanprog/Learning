package ch_34_03.home.lst_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PointsPanel extends JPanel {

    private ArrayList<MyPoint> points;

    public PointsPanel() {
        this.points = new ArrayList<>();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                points.add(new MyPoint(e.getX(), e.getY()));

                if (points.size() >= 2) {

                    double min = points.get(0).getDistance(points.get(1));
                    int p1 = 0;
                    int p2 = 1;

                    for (int i = 0; i < points.size() - 1; i++) {
                        for (int j = i + 1; j < points.size(); j++) {

                            double dist = points.get(i).getDistance(points.get(j));

                            if (dist < min) {
                                min = dist;
                                p1 = i;
                                p2 = j;
                            }

                        }
                    }

                    for (MyPoint point : points)
                        point.setFill(false);

                    points.get(p1).setFill(true);
                    points.get(p2).setFill(true);
                }

                repaint();
            }
        });

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (MyPoint point : points) {
            if (point.isFill())
                g.fillOval(point.getxCoord(), point.getyCoord(), point.getDiametr(), point.getDiametr());
            else
                g.drawOval(point.getxCoord(), point.getyCoord(), point.getDiametr(), point.getDiametr());
        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }
}
