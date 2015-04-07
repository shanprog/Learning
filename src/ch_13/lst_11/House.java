package ch_13.lst_11;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {

    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        House houseClone = (House)super.clone();
        houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
        return houseClone;

    }

    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
}
